import java.util.Scanner;
/**
 * A simple bank account management program to demonstrate Exception handling.
 * Author:-MOHD FAISAL
 */

//User defined Exception class
class acExp extends Exception
{
    public acExp(String msg)
    {
        super(msg);
    }
}
/**
 * A simple bank account management program.
 */
class BankAccount
{
    // Scanner object for user input
    static Scanner sc=new Scanner(System.in);
    //Bank Balance
    static int ac;
    //Bank account password
    static String password;
    //Bank account holder name
    static String name;
    /**
     * Creates a new bank account.
     * The user is prompted to enter their name, password, and make an initial deposit.
     * If the deposit is less than 500, an exception is thrown.
     */
    private static void CreatAccount()
    {
        try
        {
            System.out.println("Enter your name to create account:");
            sc.nextLine();
            name = sc.nextLine();
            sc.nextLine();  // Consume newline character
            System.out.println("Enter password:");
            String pwd=sc.nextLine();
            password=pwd;
            acFee();
            System.out.println("Account created :\n" + "Name :" + name + "\nBalance :" + ac+"\nPassword :"+password);
        }
        catch (acExp e)
        {
            System.out.println(e.getMessage());
        }
    }
    /**
     * Requests the user to make an initial deposit to the account.
     * If the deposit is less than 500, an exception is thrown.
     *
     * @throws acExp if the deposit is insufficient to create an account.
     */
    private static void acFee() throws acExp
    {
        int x;
        System.out.println("Deposite a min amount 500 to creat account:");
        x = sc.nextInt();
        if(validate(x))
        {
            ac=x;
        }
        else
            throw new acExp("Insufficient amount to creat account.");
    }
    /**
     * Validates if the given deposit amount is sufficient to create an account.
     *
     * @param a the amount to validate
     * @return true if the deposit is sufficient, false otherwise
     */
    private static boolean validate(int a)
    {
        if(a<500)
            return false;
        return true;

    }
    /**
     * Deposits a specified amount into the account.
     * The user is prompted to enter the deposit amount.
     */

    private static void deposite()
    {
        System.out.println("Enter amount to deposite:");
        int a=sc.nextInt();
        ac+=a;
        System.out.println("Now your balance is:"+ac);
    }
    /**
     * Withdraws a specified amount from the account.
     * The user is prompted to enter the withdrawal amount.
     * If the withdrawal amount exceeds the account balance, an exception is thrown.
     */
    private static void withdraw()
    {
        try
        {
            System.out.println("Enter amount to withdraw:");
            int a = sc.nextInt();
            avail(a);
            ac = ac - a;
            System.out.println("Withdrawl succeed.\nYour balance is:"+ac);
        }
        catch (acExp e)
        {
            System.out.println(e.getMessage());
        }
    }
    /**
     * Checks if the account balance is sufficient for a specified withdrawal amount.
     *
     * @param a the withdrawal amount to check
     * @throws acExp if the account balance is insufficient for the withdrawal
     */
    private static void avail(int a) throws acExp
    {
        if(a>ac)
            throw new acExp("Insufficient balance:");
    }
    /**
     * Displays the current account balance.
     */
    private static void checkBal()
    {
        System.out.println("Your balance is:"+ac);
    }
    /**
     * Main method to execute the bank account management program.
     * The user is presented with a menu to create an account, check balance, withdraw, deposit, or exit.
     */

    public static void main(String[] args) {
        BankAccount customer = new BankAccount();
        int option;
        do
        {
            System.out.println("1-> Create account\n2->Check balance\n3->Withdrawl\n4->Deposite\n5->Exit");
            option = customer.sc.nextInt();
            switch (option) {
                case 1:
                    customer.CreatAccount();
                    break;
                case 2:
                    customer.checkBal();
                    break;
                case 3:
                    customer.withdraw();
                    break;
                case 4:
                    customer.deposite();
                    break;
                case 5:
                    System.exit(0);
                default:
                {
                    System.out.println("Invalid. Please enter a valid option.\n");
                }
            }
        }while (option!=5);
    }
}