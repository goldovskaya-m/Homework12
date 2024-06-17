public class Author {
    public final String firstName;
    public final String lastName;
    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    private String getFirstName(){
        return this.firstName;
    }

    private   String getLastName(){
        return this.lastName;
    }
}


