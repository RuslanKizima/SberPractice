import java.io.IOException;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) throws IOException {
        int n = 3;
        int i = 0;
        Scanner read = new Scanner(System.in);
        String word;


        System.out.println("Что это такое: синий, большой, с усами и поностью набит зайцами?");
        word = read.nextLine();
        while (i < n){
            switch (word) {
                case "Троллейбус":
                    System.out.println("Правильно!");
                    i = n;
                    break;
                case "Сдаюсь":
                    System.out.println("Правильный ответ: Троллейбус.");
                    i = n;
                    break;
                default:
                    i++;
                    System.out.println("Подумай ещё.");
                    if(i < n) {
                        word = read.nextLine();
                    }
            }
        }
    }
}
