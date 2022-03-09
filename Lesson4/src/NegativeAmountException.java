public class NegativeAmountException extends BankOnlineException{
    public NegativeAmountException(){}

    public NegativeAmountException(String msg){
        super(msg);
    }

}
