public class NewVehicle {
    private int serialNumber;
    private String name;
    private String model;
    private int year;
    private String manufacturer;
    private float baseCost;
    private SalesInvoice salesInvoice;
    private Salesperson salesperson;

    public NewVehicle(int serialNumber, String name, String model, int year, String manufacturer, float baseCost) {
        this.serialNumber = serialNumber;
        this.name = name;
        this.model = model;
        this.year = year;
        this.manufacturer = manufacturer;
        this.baseCost = baseCost;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("serialNumber = ").append(serialNumber);
        sb.append(", name = ").append(name);
        sb.append(", model = ").append(model);
        sb.append(", year = ").append(year);
        sb.append(", manufacturer = ").append(manufacturer);
        sb.append(", baseCost = ").append(baseCost);
        return sb.toString();
    }
}