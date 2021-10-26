package upper.lesson02;

public class AuthenticationAlgorithm {
    public static void main(String[] args) {
        // USER_ACCOUNTS // is a collection of user records
        UserAccountRepository userAccounts = new UserAccountRepository();
        userAccounts.addUserAccount(new UserAccount("erika.camilleri@gmail.com", "password123"));
        
        
        
        
        // INPUT USERNAME
        // INPUT PASSWORD
        // USER_ACCOUNT = NULL
        // loop while USER_ACCOUNTS.hasNext() 
        //     FOUND = false
        //     if USER_ACCOUNT[POS].username = USERNAME
        //          USER_ACCOUNT = USER_ACCOUNT[POS]
        //          FOUND = true
        //     end if
        // end loop
        // if FOUND = false then
        //     DISPLAY "There is a problem with your credentials."
        // else if PASSWORD = USER_ACCOUNT.password
        //     DISPLAY "You are logged in."
        // else
        //     DISPLAY "There is a problem with your credentials."
        // end if
    }
}
