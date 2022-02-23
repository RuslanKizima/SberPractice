public class Phone {

    private String number, model, weight;

    Phone(String number, String model, String weight){
        this.model = model;
        this.number = number;
        this.weight = weight;
    }

    Phone(String number, String model){
        this.model = model;
        this.number = number;
    }

    Phone(){}

    public void receiveCall(String name){
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, String number){}

    public void sendMessage(String[] contacs){
        int n;
        n = contacs.length;
        for (int i = 0; i < n; i++) {
            System.out.println(contacs[i]);
        }
    }

    public void toStrings(){
        System.out.println("model: " + this.model);
        System.out.println("number: " + this.number);
        System.out.println("weight: " + this.weight);
    }

    public String getNumber(){
        return number;
    }


}
