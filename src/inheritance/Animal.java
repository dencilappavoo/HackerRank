package inheritance;
/**
 * This is parent (also called as super or base) class Animal
 *
 *
 * */
class Animal {
    int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void sound() {
        System.out.println("By default it is mute");
    }
}
