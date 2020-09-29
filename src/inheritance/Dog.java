package inheritance;
/**
 * This is subclass (also called as derived or child or extended) Dog which is extending Animal
 */

class Dog extends Animal{
    // Own behavior
    private void bark() {
        System.out.println("Dog '" + getId() + "' is barking");
    }

    // Overriding super class behavior
    @Override
    public void sound() {
        bark();
    }
}

