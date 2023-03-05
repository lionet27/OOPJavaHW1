package HW1;

public class Sparrow extends Animal{
    public Sparrow(String name, String color) {
        super(name, color,2,true,true,false);
    }

    public Sparrow(String name) {
        this(name, null);
    }

    @Override
    public void speak() {
        System.out.println("Chiv-chiv!");
    }

    
}
