package sample;

public class VIPCustomer {

    private String customerName;
    private int customerCreditLimit;
    private String customerEmail;

    public VIPCustomer() {
        this("Enter Name", 123456, "enter.email@email.com");
        System.out.println("Empty constructor called");
    }

    public VIPCustomer(String customerName, int customerCreditLimit, String customerEmail) {
        this.customerName = customerName;
        this.customerCreditLimit = customerCreditLimit;
        this.customerEmail = customerEmail;
        System.out.println(customerName + "  " + customerCreditLimit + "  " + customerEmail);
    }

    public VIPCustomer(String customerName, int customerCreditLimit) {
        this(customerName, customerCreditLimit, "enter.email@email.com");
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public int getCustomerCreditLimit() {
        return this.customerCreditLimit;
    }

    public String getCustomerEmail() {
        return this.customerEmail;
    }
}
