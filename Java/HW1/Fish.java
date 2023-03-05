package HW1;

public class Fish extends Animal{
    public Fish(String name, String color) {
        super(name, color,2,false,false,true);
    }

    public Fish(String name) {
        this(name, null);
    }

    @Override
    public void speak() {
        System.out.println("bul-bul");
    }
}
