package HW1;

public class Animal {
    private String name;
    private String color;
    private int pawsCount;
    public boolean fly;
    public boolean toGo;
    public boolean swim;

    public Animal(String name, String color, int pawsCount,boolean fly, boolean toGo,boolean swim) {
        this.name = name;
        this.color = color;
        this.pawsCount = pawsCount;
        this.fly=fly;
        this.toGo=toGo;
        this.swim=swim;

    }

    public Animal(String name) {
        this(name, null, 0,true,true,true);
    }

    public Animal() {
        this(null);
    }

    @Override
    public String toString() {
        return String.format("Имя: %s, Цвет: %s", this.name, this.color);
    }

    public String getType() {
        return this.getClass().getSimpleName();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPawsCount() {
        return pawsCount;
    }

    public void setPawsCount(int pawsCount) {
        this.pawsCount = pawsCount;
    }

    public void speak() {
        System.out.println("Yarr!!");
    }

    public void Swim() {
        if (this.swim==true){
            System.out.println("I'm swimming!");
        }else {
            System.out.println("I can't swim!");
        }    
    }

    public void ToGo() {
        if (this.toGo==true){
            System.out.println("I'm going!");
        }else {
            System.out.println("I can't go!");
        }    
    }

    public void Fly() {
        if (this.fly==true){
            System.out.println("I'm flyng!");
        }else {
            System.out.println("I can't fly!");
        }    
    }

}
