package Demo2;

/*

Hands on design patterns with java book

 */

public class CreateBankAccount {
    private static CreateBankAccount newAccount;

    private CreateBankAccount()
    {

    }

    public static CreateBankAccount getnewAccount()
    {
        if(newAccount ==  null)
        {
            newAccount = new CreateBankAccount();
            System.out.println("New account created ... ");
        }
        else
        {
            System.out.println("Account already created ... ");
        }
        return newAccount;
    }
}
