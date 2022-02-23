public class PizzaOrder {
    private sizePizza size;
    private Boolean sauce = false;
    private String deliveryAddress;
    private Boolean orderAccept = false;

    PizzaOrder(){
        this.size = size;
        this.sauce = sauce;
        this.deliveryAddress = deliveryAddress;
    }

    public void order(){
        if (orderAccept){
            System.out.println("Заказ уже принят");
        }
        else {
            orderAccept = true;
            if (size == sizePizza.SMALL) {
                if (sauce) {
                    System.out.println("Заказ принят. Маленькая пицца 4Сыра c соусом на адрес " + deliveryAddress);
                }
                else{
                    System.out.println("Заказ принят. Маленькая пицца 4Сыра без соуса на адрес " + deliveryAddress);
                }
            } else if (size == sizePizza.MEDIUM) {
                if (sauce) {
                    System.out.println("Заказ принят. Средняя пицца 4Сыра c соусом на адрес " + deliveryAddress);
                }
                else{
                    System.out.println("Заказ принят. Средняя пицца 4Сыра без соуса на адрес " + deliveryAddress);
                }
            } else{
                if (sauce) {
                    System.out.println("Заказ принят. Большая пицца 4Сыра c соусом на адрес " + deliveryAddress);
                }
                else{
                    System.out.println("Заказ принят. Большая пицца 4Сыра без соуса на адрес " + deliveryAddress);
                }
            }
        }
    }

    public String toString(){
        return String.format("Размер пиццы: %s, адрес доставки: %s", size, deliveryAddress);
    }

    public void cancel(){
        if (orderAccept){
            orderAccept = false;
            System.out.println("Заказ отменён");
        }
        else{
            System.out.println("Отмечать нечего");
        }
    }

    public sizePizza getSize(){
        return size;
    }
    public void setSize(sizePizza size){
        this.size = size;
    }
    public Boolean getSauce(){
        return sauce;
    }
    public void setSauce(Boolean sauce){
        this.sauce = sauce;
    }
    public String getDeliveryAddress(){
        return deliveryAddress;
    }
    public void setDeliveryAddress(String deliveryAddress){
        this.deliveryAddress = deliveryAddress;
    }
    public Boolean getOrderAccept(){
        return orderAccept;
    }
    public void setOrderAccept(Boolean orderAccept){
        this.orderAccept = orderAccept;
    }
}