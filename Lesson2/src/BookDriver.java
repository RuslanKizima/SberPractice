public class BookDriver {

    public static void main(String[] args){
        Author Oleg = new Author("Oleg", "man", "Oleg@email.ru");
        Book book = new Book(Oleg, "2012");
        System.out.println(book);

    }

}
