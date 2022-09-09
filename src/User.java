import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.security.MessageDigest;

public class User {

    /**
     * The first name of the user
     */
    private String firstName;

    /**
     * The last name of the user
     */
    private String lastName;

    /**
     * The ID number of the user
     */
    private String uuid;

    /**
     * The MD5 hash of the users pin number.
     */
    private byte pinHash[];

    /**
     * The list of accounts for this user
     */
    private ArrayList<Account> accounts;


    public User(String firstName, String lastName, String pin,Bank theBank) {
        this.firstName = firstName;
        this.lastName = lastName;

        // store the pins MD5 hash, rather than original value,for security reasons
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            System.err.println("error, caught NoSuchAlgorithmException");
            e.printStackTrace();
            System.exit(1);
        }
    }
}
