package upper.lesson02.user_authentication;

import java.util.Scanner;

public class AuthenticationAlgorithm {
    public static void main(String[] args) {
        // USER_ACCOUNTS // is a collection of user records
        UserAccountRepository userAccounts = new UserAccountRepository();
        userAccounts.addUserAccount(new UserAccount("erika.camilleri@gmail.com", "password123"));
        userAccounts.addUserAccount(new UserAccount("paul.waterssmith@gmail.com", "password123"));
        userAccounts.addUserAccount(new UserAccount("jolan.brown@gmail.com", "password123"));
        userAccounts.addUserAccount(new UserAccount("amy.micallef@gmail.com", "password123"));
        userAccounts.addUserAccount(new UserAccount("dianne.borg@gmail.com", "password123"));

        // INPUT USERNAME
        // INPUT PASSWORD
        Scanner sc = new Scanner(System.in);
        System.out.println("Please type in your username...");
        String username = sc.next();
        System.out.println("Please type in your password...");
        String password = sc.next();
        // USER_ACCOUNT = NULL
        UserAccount userAccount = userAccounts.findByUsername(username);
        // if FOUND = false then
        if (userAccount == null) {
            //     DISPLAY "There is a problem with your credentials."
            System.out.println("There is a problem with your credentials - here");
        } else if (userAccount.getPassword().equals(password)) {
            // else if PASSWORD = USER_ACCOUNT.password
            //     DISPLAY "You are logged in."
            System.out.println("You are logged in!");
        } else {
            // else
            //     DISPLAY "There is a problem with your credentials."
            // end if
            System.out.println("There is a problem with your credentials");
        }

        // Close resources...
        sc.close();
    }
}
