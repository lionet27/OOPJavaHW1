// Добавить в класс Animal методы двигаться(toGo), летать(fly), плавать(swim).
//  Создать по два класса наследника Animal, умеющих летать, плавать, бегать. 
// В файле readme.md в репозитории github (или ему подобных) описать какие проблемы в таком проектировании Вы увидели, 
// там же написать возникшие при выполнении дз вопросы (если они есть).

package HW1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
      

        List<Animal> animals = new ArrayList<>();
        animals.add(new Cat("Мурка"));
        animals.add(new Dog("Бобик"));
        animals.add(new Duck("Дональд"));
        animals.add(new Crocodile("Кроко"));
        animals.add(new Fish("Немо"));
        animals.add(new Sparrow("Воробышек"));

//        animals.forEach(Animal::speak);

       for (Animal a: animals) {
           System.out.println(a);
           a.Fly();
           a.Swim();
           a.ToGo();
       }
     
    }
}