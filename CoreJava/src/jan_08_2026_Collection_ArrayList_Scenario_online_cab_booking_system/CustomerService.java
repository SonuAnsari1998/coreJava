package jan_08_2026_Collection_ArrayList_Scenario_online_cab_booking_system;

import java.util.ArrayList;

public class CustomerService {

    private ArrayList<Customer> customers;

    public CustomerService() {
        customers = new ArrayList<>();
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    private boolean isFirstCustomer(Customer customer) {
        for (Customer c : customers) {
            if (c.phone().equals(customer.phone())) {
                return false;
            }
        }
        return true;
    }

    public double calculateBill(Customer customer) {
        boolean isNewCustomer = isFirstCustomer(customer);

        if (isNewCustomer) {
            addCustomer(customer);
            return 0.0;
        }

        int distance = customer.distance();
        double bill;

        if (distance <= 4) {
            bill = 80;
        } else {
            bill = 80 + (distance - 4) * 6;
        }

        addCustomer(customer);
        return bill;
    }

    public String printBill(Customer customer) {
        double billAmount = calculateBill(customer);
        return customer.customerName() + " Please pay your bill of Rs." + billAmount;
    }
}
