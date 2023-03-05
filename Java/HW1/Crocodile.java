package HW1;

public class Crocodile extends Animal{
    public Crocodile(String name, String color) {
        super(name, color,2,false,true,true);
    }

    public Crocodile(String name) {
        this(name, null);
    }

    @Override
    public void speak() {
        System.out.println("hr-r-r");
    }
    
}
