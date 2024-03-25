package PizzaHut;

import java.util.Arrays;
import java.util.ListIterator;

public class Customer {
    private int custNo;
    private String custName;
    private String custAddr;
    private int billNo;
    private static Customer[] custList = new Customer[99];
    private static int billNoCounter = 0;

    public void setBillNo() {
        this.billNo = billNoCounter;
    }

    public Customer(int custNo, String custName, String custAddr) {
        this.custNo = custNo;
        this.custName = custName;
        this.custAddr = custAddr;
        billNoCounter++;
        setBillNo();
    }

    public Customer(){
        this.custNo = 1;
        this.custName = "Ram";
        this.custAddr = "123 Default St.";
        billNo++;
        setBillNo();
    }

    void display(){
        System.out.println("The customer number is " + custNo);
        System.out.println("The customer name is " + custName);
        System.out.println("The customer address is " + custAddr);
    }

    public int getCustNo() {
        return custNo;
    }

    public String getCustName() {
        return custName;
    }

    public String getCustAddr() {
        return custAddr;
    }

    public void setCustNo(int custNo) {
        this.custNo = custNo;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public void setCustAddr(String custAddr) {
        this.custAddr = custAddr;
    }

    public static void addCustomer(Customer customer) {
        custList[customer.getCustNo()] = customer;
    }

    public static void printList(){
        if (custList != null){
            for (Customer customer: custList){
                if (customer != null){
                    System.out.println();
                    customer.display();
                }
            }
        } else {
            System.out.println("custList is empty");
        }

    }

    public void printBillNo(){
        System.out.println();
        System.out.println("Bill No: " + billNo + "\t" + "\t" + "\t" + "Date: ");
        System.out.println();
        System.out.println("Customer: " + custName);
        System.out.println("Address: " + custAddr);
    }
}
