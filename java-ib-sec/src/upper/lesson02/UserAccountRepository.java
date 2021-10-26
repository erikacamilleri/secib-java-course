package upper.lesson02;

import java.util.ArrayList;

public class UserAccountRepository {
    protected ArrayList<UserAccount> userAccountList;

    /**
     * 
     */
    public UserAccountRepository () {
        this.userAccountList = new ArrayList<UserAccount>();
    }

    /**
     * Adding a UserAccount instance to the repository
     * @param userAccount
     */
    public void addUserAccount(UserAccount userAccount) {
        this.userAccountList.add(userAccount);
    }
}
