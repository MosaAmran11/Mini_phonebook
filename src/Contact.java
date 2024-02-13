import java.util.regex.Pattern;

/**
 * Contact
 */
// create class for Contacts?
public class Contact {
    private final String name;
    private final String phoneNumber;
    private final String email;

    public Contact(String name, String phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        // Validate email address
        if (email == null || !isValidEmail(email)) {
            throw new IllegalArgumentException("Invalid email address: " + email);
        }
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    private static boolean isValidEmail(String email) {
        String emailRegex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
        return Pattern.compile(emailRegex).matcher(email).matches();
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}