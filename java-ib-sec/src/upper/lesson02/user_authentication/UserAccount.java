package upper.lesson02.user_authentication;

public class UserAccount {
    
    protected String username;
    
    protected String password;

    /**
     * The UserAccount constructor
     * @param username
     * @param password
     */
    public UserAccount(String username, String password) {
        this.username = username;
        this.password = password;
    }

    /**
     * Standard Java Getters
     */
    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }
}
