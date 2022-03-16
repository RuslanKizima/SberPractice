package Task3;

import java.io.Serializable;

public class Hero implements Serializable {
    String name;
    int lvl;
    Weapon weapon;
    Armor armor;

    public Hero(String name){
        this.name = name;
        this.lvl = 1;
        this.weapon = new Axe();
        this.armor = new BronzeArmor();
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getLvl(){
        return lvl;
    }
    public void setLvl(int lvl){
        this.lvl = lvl;
    }

    public Armor getArmor(){
        return armor;
    }
    public void setArmor(Armor armor){
        this.armor = armor;
    }

    public Weapon getWeapon(){
        return weapon;
    }
    public void setWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    @Override
    public String toString(){
        return  "Hero(" +
                "name: " + name +
                ", lvl: " + lvl +
                ", weapon: " + weapon +
                ", armor: " + armor + ")";
    }

}
