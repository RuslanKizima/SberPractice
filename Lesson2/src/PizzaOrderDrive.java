public class PizzaOrderDrive {
    public static void main(String[] args) {
        PizzaOrder piza = new PizzaOrder();
        piza.cancel();
        piza.setDeliveryAddress("Костромская 5Б");
        piza.setSize(sizePizza.MEDIUM);
        piza.setSauce(true);
        piza.order();
        System.out.println(piza.toString());
        piza.cancel();


    }
}
