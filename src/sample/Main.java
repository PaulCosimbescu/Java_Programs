package sample;

public class Main {

    public static void main(String[] args) {

        BankAccount paulsAccount = new BankAccount("42268680", 500.0, "Paul Cosimbescu",
                "paul@gmail.com", "075555555");
        //paulsAccount.depositFunds(300.0);
        paulsAccount.withdrawFunds(100.0);

        VIPCustomer paul = new VIPCustomer("Paul Cosimbescu", 2000,
                "paul@gmail.com");
    }
}