package addition;

public class TestSto {
    public static void main(String[] args) {
        Car car1 = new Car("Opel", "Astra", 2001, 2200, "diesel",
                "AT", 250000);
        Customer customer1 = new Customer("Ivanov", car1, true, true,
                true, true, false, false, false,
                false, true);
        Sto sto1 = new Sto(true, true, true, true, false,
                customer1, car1);
        sto1.engineService(customer1, car1);
        sto1.filterService(customer1,car1);
        sto1.computerDiagnostic(customer1, car1);
        sto1.calculateTotalCost();
        
    }
}
