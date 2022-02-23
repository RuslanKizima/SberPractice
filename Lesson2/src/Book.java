public class Book {
    private Author author;
    private String age;

    Book(Author author, String age){
        this.author = author;
        this.age = age;
    }

    public Author getAuthor(){
        return author;
    }

    public String getAge(){
        return age;
    }

    public String toString(){
        return String.format("name: %s, gender: %s, email: %s, age: %s",
                author.getName(), author.getGender(), author.getEmail(), age);
    }


}
