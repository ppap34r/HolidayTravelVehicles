import java.util.ArrayList;

public class SalesInvoice {
    private int invoiceID;
    private String date;
    private String tradeIninfo;
    private String tradeInallowance;
    private String option;
    private float finalPrice;
    private float taxes;
    private float licenseFees;
    private String customerSignature;
    private Customer customer;
    private Salesperson salesperson;
    private NewVehicle newvehicle;
    private ArrayList<Options> options;
    private ArrayList<TradeInVehicle> tradeinvehicles;

    public SalesInvoice(int invoiceID, String date, String tradeIninfo, String tradeInallowance, String option, float taxes, float licenseFees, String customerSignature, float finalPrice) {
        this.invoiceID = invoiceID;
        this.date = date;
        this.tradeIninfo = tradeIninfo;
        this.tradeInallowance = tradeInallowance;
        this.option = option;
        this.finalPrice = finalPrice;
        this.licenseFees = licenseFees;
        this.taxes = taxes;
        this.customerSignature = customerSignature;
    }
}
