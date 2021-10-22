package lesson6.animals;

public class Cat extends Animal {

    private String name;
    public Cat(String name) {
        super(name);
        this.name = name;
        catCount++;
        System.out.println("Создана кошка " + name);
    }

    private final int MAX_RUN_DISTANCE = 200;

    @Override
    public void swim(int swimDistance) {
        System.out.println(name + " не умеет плавать.");
    }

    @Override
    public void run(int runDistance) {
        if (runDistance < MAX_RUN_DISTANCE && runDistance >= 0)
            System.out.println("КОШКА: " + name + " пробежал(а) " + runDistance + " метров.");
        else if (runDistance > MAX_RUN_DISTANCE) {
            System.out.println("КОШКА: " + name + " не может пробежать больше " + MAX_RUN_DISTANCE + " метров за один раз.");
        } else {
            System.out.println("Ошибка! Расстояние не может быть отрицательным.");
        }
    }
}
