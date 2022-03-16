public class BlockedCardException extends BankOnlineException{

    public BlockedCardException(){};

    public BlockedCardException(String msg){
        super(msg);
    }

}
