package HW1;

public class Dog extends Animal {
    public Dog(String name, String color) {
        super(name, color,4,false,true,true);
    }

    public Dog(String name) {
        this(name, null);
    }

    @Override
    public void speak() {
        System.out.println("Woof!");
    }
}
