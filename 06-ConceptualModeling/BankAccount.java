public class BankAccount {
    private String owner;
    private String number;
    private double balance;

    public BankAccount(String owner, String number) {
        this.owner = owner;
        this.number = number;
    }

    public String getOwner() {
        return owner;
    }

    public String getNumber() {
        return number;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double money) {
        setBalance(getBalance() + money);
    }

    public void withdraw(double money) {
        if ((getBalance() >= money) && (money <= 500)) {
            setBalance(getBalance() - money);
        } else if (getBalance() < money) {
            System.out.println("You don't have enough money on your account!");
        } else {
            System.out.println("You can't withdraw more than 500 PLN at one time!");
        }
    }

    public void displayBalance() {
        System.out.println(getBalance());
    }

    public static void main(String[] args) {
        BankAccount a1 = new BankAccount("Joanna", "12345678910");
        a1.deposit(600);
        a1.displayBalance();
        a1.withdraw(501);
        a1.displayBalance();
        a1.withdraw(2);
        a1.displayBalance();
        a1.withdraw(599);
        a1.displayBalance();
    }
}