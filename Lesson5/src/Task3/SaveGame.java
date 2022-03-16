package Task3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SaveGame {

    public static void main(String[] args) throws IOException {
        Hero hero = new Hero("Артём");

        System.out.println(hero);

        hero.setWeapon(new Sword());
        hero.setArmor(new SteelArmor());
        hero.setLvl(7);

        System.out.println(hero);

        try (FileOutputStream save = new FileOutputStream("Lesson5/src/Task3/save.bin");
            ObjectOutputStream saveHero = new ObjectOutputStream(save)){
            saveHero.writeObject(hero);
        }
    }

}
