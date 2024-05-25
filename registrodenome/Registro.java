package registrodenome;

public class Registro {
    @SuppressWarnings("unused")
    private String fullName;

    public void setName(String firstName, String lastName) {
        String fullName = firstName + " " + lastName;
        this.fullName = fullName;
    }

    public static void main(String[] args) {

    }
}
