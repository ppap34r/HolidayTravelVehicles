import java.util.ArrayList;

public class Salesperson {
    private int salespersonID;
    private String sName;
    private ArrayList<SalesInvoice> salesInvoice;
    private ArrayList<NewVehicle> newvehivle;

    public Salesperson (int salespersonID, String saleName){
        this.salespersonID = salespersonID;
        this.sName = saleName;
    }
}


