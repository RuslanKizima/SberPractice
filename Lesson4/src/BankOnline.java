import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class BankOnline {

    public void send(String numCard, double sumRemit) throws BankOnlineException {
        if (numCard.replaceAll(" ", "").length() != 16){
            throw  new ErrEntCardNumberException("Ошибка при вводе номера карты.");
        }


        try (FileWriter fileBcards = new FileWriter("BlockedCards")) {
            //Сравнение с блокированными картами
        } catch (FileNotFoundException exception){
            System.err.println("Файл не найдет");
        } catch (IOException exception){
            System.err.println("Ошибка при чтении файла.");
        }

        if (sumRemit < 0){
            throw new NegativeAmountException("Введена отрицательная сумма перевода.");
        }

        if (numCard == null) {
            throw new CardNumNotEntException("Не ввелён номер карты.");
        }
        else if (sumRemit == 0){
            throw new TransAmoutNotEntException("Не введена сумма перевода.");
        }

    }

}
