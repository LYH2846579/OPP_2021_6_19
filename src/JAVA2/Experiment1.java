package JAVA2;

/**
 * @author LYHstart
 * @create 2021-06-26 21:08
 */
public class Experiment1
{
    public static void main(String[] args)
    {
        Customer c1 = new Customer("Jane","Smith");
        Account a1 = new Account(1000,2000,1.23);
        c1.setAccount(a1);
        c1.getAccount().deposit(100);           //属性类方法调用
        c1.getAccount().withdrow(960);
        c1.getAccount().withdrow(2000);

    }
}


class Customer
{
    private String firstName;
    private String lastName;
    private Account account;

    public Customer(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account)
    {
        this.account = account;
    }
}








class Account
{
    private int id;
    private double balance;
    private double annuallnterestRate;

    public Account(int id, double balance, double annuallnterestRate)
    {
        this.id = id;
        this.balance = balance;
        this.annuallnterestRate = annuallnterestRate;
    }

    public int getId()
    {
        return id;
    }

    public double getBalance()
    {
        return balance;
    }

    public double getAnnuallnterestRate()
    {
        return annuallnterestRate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnuallnterestRate(double annuallnterestRate) {
        this.annuallnterestRate = annuallnterestRate;
    }

    public void withdrow(double amount)
    {
        if(this.balance<amount)
            System.out.println("您的余额已不足!");
        else
        {
            this.balance -= amount;
            System.out.println("您已取出"+amount+"元");
        }
    }

    public void deposit(double amount)
    {
        this.balance += amount;
        System.out.println("您已存入"+amount+"元");
    }

}