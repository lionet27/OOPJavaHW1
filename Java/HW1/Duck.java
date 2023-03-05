package HW1;

public class Duck extends Animal {
    public Duck(String name, String color) {
        super(name, color,2,true,true,true);
    }

    public Duck(String name) {
        this(name, null);
    }

    @Override
    public void speak() {
        System.out.println("Quack!");
    }

    
}
