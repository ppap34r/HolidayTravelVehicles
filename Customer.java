import java.util.ArrayList;

public class Customer {
    private int customerID;
    private String name;
    private String address;
    private String phone;
    private ArrayList<SalesInvoice> salesInvoice;
    private ArrayList<TradeInVehicle> tradeinvehicles;

    public Customer (int customerID, String name, String address, String phone) {
        this.customerID = customerID;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }
}