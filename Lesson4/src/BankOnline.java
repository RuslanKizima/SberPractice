import javax.swing.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class BankOnline {

    public void send(String numCard, double sumRemit) throws BankOnlineException {
        if (numCard.replaceAll(" ", "").length() != 16){
            throw new ErrEntCardNumberException("Ошибка при вводе номера карты.");
        }

        String testCard = numCard.replaceAll(" ", "");
        for (int i = 0; i < testCard.length(); i++) {
            if (!((testCard.charAt(i) >= '0') && (testCard.charAt(i) <= '9'))) {
                throw new ErrEntCardNumberException("Ошибка при вводе номера карты.");
            }
        }


        try (FileInputStream fileBcards = new FileInputStream("Lesson4/src/BlockedCards")) {
            //Сравнение с блокированными картами
            int b;
            String s = "";
            while ((b = fileBcards.read()) != -1 ){
                if ((b != 13) && (b != 10)) {
                    s += (char) b;
                } else {
                    if (numCard.equals(s)){
                        throw new BlockedCardException("Данная карта заблокированна.");
                    } else {
                        s = "";
                    }
                }
            }
        } catch (FileNotFoundException exception){
            System.err.println("Файл не найдет");
        } catch (IOException exception){
            System.err.println("Ошибка при чтении файла.");
        }

        if (sumRemit < 0){
            throw new NegativeAmountException("Введена отрицательная сумма перевода.");
        }

        if (numCard == null) {
            throw new CardNumNotEntException("Не введён номер карты.");
        } else if (sumRemit == 0){
            throw new TransAmoutNotEntException("Не введена сумма перевода.");
        }

        System.out.println("Перевод денежных средств выполнен успешно.");

    }

}
