public class Author {
    private String name, gender, email;

    Author(String name, String gender, String email){
        this.name = name;
        this.gender = gender;
        this.email = email;
    }

    public String getName(){
        return name;
    }

    public String getGender(){
        return gender;
    }

    public String getEmail(){
        return email;
    }

}
