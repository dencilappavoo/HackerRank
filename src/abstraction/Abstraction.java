package abstraction;

/**
 * Test class for Person
 */

public class Abstraction {

    public static void main(String[] args) {

        Person p1 = new Person();
        p1.setName("Appavoo");
        /*
         * Note: As id and name are encapsulated in Person class, those cannot be accessed directly here. Also there is no way to assign id in this
         * class. Try to uncomment below code and you would find compile time error.
         */
        // p1.id = "123";
        // p1.name = "this will give compile time error";
        // p1.sayHello(); // You can't access this method, as it is private to Person

        System.out.println("Person 1 - " + p1.getId() + " : " + p1.getName());
    }
}
