package Task1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReBorodino {

    public static void main(String[] args) throws IOException {
        try (FileReader borodino = new FileReader("Lesson5/src/Task1/Borodino.txt");
             FileWriter reBorodino = new FileWriter("Lesson5/src/Task1/reBorodino.txt")){

            int b;
            boolean space = true;
            while ((b = borodino.read()) != -1) {
                if (b != ' ') {
                    reBorodino.write(b);
                    space = true;
                } else if (space) {
                    reBorodino.write(b);
                    space = false;
                }
            }
//                boolean isRussia = ((b >= 'А') && (b <= 'Я')) || ((b >= 'а') && (b <= 'я'));
//                if (isRussia) {
//                    reBorodino.write(b);
//                } else if (b == ' ') {
//                    reBorodino.write(b);
//                } else {
//                    reBorodino.write(b);
//                }

        }
    }

}
