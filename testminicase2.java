public class testminicase2 {
    public static void main(String[] args) {
        NewVehicle testVehicle = new NewVehicle (2000, "Porche", "Taycan", 2024, "Porche", 7500000);
        System.out.println("Build Your Mean");
        System.out.println(testVehicle.toString());

        Customer customer = new Customer (001, "Alice", "123 Main St",  "0890987890");
        System.out.println("Customer: " + customer);

        Salesperson salesperson = new Salesperson (901, "Bob Smith");
        System.out.println("Salesperson: " + salesperson);

        TradeInVehicle tradeIn = new TradeInVehicle (19008, "Civic", "Honda", 2023);
        System.out.println("Trade-In Vehicle: " + tradeIn);

        Options option1 = new Options (101, "Red Leather Seats", 50000);
        Options option2 = new Options (102, "Lime Brake Caiper", 32500);
        System.out.println("Options: " + option1 + ", " + option2);
    }
    
}