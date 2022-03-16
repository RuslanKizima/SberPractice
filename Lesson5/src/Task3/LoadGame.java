package Task3;

import java.io.*;

public class LoadGame {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        try (
                FileInputStream loadSave = new FileInputStream("Lesson5/src/Task3/save.bin");
                ObjectInputStream loadSaveHero = new ObjectInputStream(loadSave)
        ){

         Hero hero = (Hero) loadSaveHero.readObject();

            System.out.println(hero);

        }
    }
}
