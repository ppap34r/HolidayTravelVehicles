public class Options {
    private int optionCode;
    private String description;
    private float price;
    private SalesInvoice salesInvoice;

    public Options (int optionCode, String description, float price) {
        this.description = description;
        this.optionCode = optionCode;
        this.price = price;
    }
}


