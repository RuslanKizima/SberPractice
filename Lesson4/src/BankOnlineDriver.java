public class BankOnlineDriver {

    public static void main(String args[]) throws BankOnlineException {
        BankOnline card = new BankOnline();
        try {
            card.send("1111 1111 1111 1112", 110);
        } catch (BlockedCardException exception){
            System.out.println(exception.getMessage());
        } catch (CardNumNotEntException exception) {
            System.out.println(exception.getMessage());
        } catch (ErrEntCardNumberException exception){
            System.out.println(exception.getMessage());
        } catch (NegativeAmountException exception) {
            System.out.println(exception.getMessage());
        } catch (TransAmoutNotEntException exception) {
            System.out.println(exception.getMessage());
        }
    }

}
