package inheritance;

public class Inheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setId(123); // inherited from super class
        dog.sound(); // overridden behavior of sub class
    }
}
