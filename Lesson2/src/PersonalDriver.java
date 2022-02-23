public class PersonalDriver {

    public static void main(String[] args){
        Phone Phone1 = new Phone("8 900 000-00-00", "Droid", "12");
        Phone Phone2 = new Phone("8 900 111-11-11", "Banana");
        Phone Phone3 = new Phone();
        String[] contacs = {"1", "2", "3", "4"};

        Phone2.receiveCall("Gena", "+7 950 637-22-11");

        Phone1.receiveCall("Anton");
        System.out.println();

        System.out.println(Phone1.getNumber());
        System.out.println();

        Phone1.toStrings();
        System.out.println();

        Phone3.sendMessage(contacs);
    }


}
