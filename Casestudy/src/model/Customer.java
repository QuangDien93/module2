package model;

public class Customer extends Person{
    private String customerCode;
    private String customerType;
    private String customerAddress;

    public Customer(String customerCode, String customerType, String customerAddress) {
        super();
        this.customerCode = customerCode;
        this.customerType = customerType;
        this.customerAddress = customerAddress;
    }
}
