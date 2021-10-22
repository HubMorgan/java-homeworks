package lesson6;

import lesson6.animals.Animal;
import lesson6.animals.Cat;
import lesson6.animals.Dog;

public class MainApp {

    public static void main(String[] args) {
        Animal[] animals = new Animal[5];
        animals[0] = new Dog("Фунтик");
        animals[1] = new Dog("Шарик");
        animals[2] = new Cat("Мурка");
        animals[3] = new Cat("Барсик");
        animals[4] = new Cat("Мурзик");

        animals[0].swim(5);
        animals[1].swim(15);
        animals[0].run(400);
        animals[2].run(788);
        animals[2].swim(100);
        animals[3].run(300);
        animals[3].swim(3);


        Animal.showAnimalCountInfo();
    }

}
