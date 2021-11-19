package movieFactory;

public class MovieStaff {
    private String firstName;
    private String lastName;


    @Override
    public String toString() {
        return firstName + " " + lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
