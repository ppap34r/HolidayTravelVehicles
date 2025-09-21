import java.util.ArrayList;

public class TradeInVehicle {
    private int serialNumber;
    private String make;
    private String model;
    private int year;
    private SalesInvoice salesInvoice;
    private Customer customer;

    public TradeInVehicle (int serialNumber, String model, String make, int year) {
        this.serialNumber = serialNumber;
        this.make = make;
        this.model = model;
        this.year = year;
    }
}
