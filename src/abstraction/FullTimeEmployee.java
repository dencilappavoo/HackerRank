package abstraction;

/**
 * The FullTimeEmployee also has it's own implementation of calculateSalary()method.
 * In this case we just multiply by constant 8 hours.
 *
 * */

public class FullTimeEmployee extends Employee{
    public FullTimeEmployee(String name, int paymentPerHour) {
        super(name, paymentPerHour);
    }

    @Override
    public int calculateSalary() {
        return getPaymentPerHour() * 8;
    }
}
