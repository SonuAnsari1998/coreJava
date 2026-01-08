package jan_08_2026_Collection_ArrayList_Scenario_online_cab_booking_system;

public class CabCustomerServiceTester {

    public static void main(String[] args) {

        CustomerService service = new CustomerService();

        try {
            // Test Case 1
            Customer c1 = new Customer(1, "JOHN", "A", "B", 6, "9876543210");
            System.out.println(service.printBill(c1));

            // Test Case 2
            Customer c2 = new Customer(2, "SMITH", "X", "Y", 4, "9876543210");
            System.out.println(service.printBill(c2));

            // Test Case 3 (JOHN again)
            Customer c3 = new Customer(3, "JOHN", "A", "C", 6, "9876543210");
            System.out.println(service.printBill(c3));

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

