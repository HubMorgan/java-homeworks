package lesson6.animals;

public class Dog extends Animal {

    private String name;

    public Dog(String name) {
        super(name);
        this.name = name;
        dogCount++;
        System.out.println("Создана собака " + name);
    }

    private final int MAX_RUN_DISTANCE = 500;
    private final int MAX_SWIM_DISTANCE = 10;

    @Override
    public void swim(int swimDistance) {
        if (swimDistance < MAX_SWIM_DISTANCE && swimDistance >= 0)
        System.out.println("СОБАКА: " + name + " пропыл(а) " + swimDistance + " метров.");
        else if (swimDistance > MAX_SWIM_DISTANCE) {
            System.out.println("СОБАКА: " + name + " не может проплыть больше " + MAX_SWIM_DISTANCE + " метров за один раз.");
        } else {
            System.out.println("Ошибка! Расстояние не может быть отрицательным.");
        }
    }

    @Override
    public void run(int runDistance) {
        if (runDistance < MAX_RUN_DISTANCE && runDistance >= 0)
            System.out.println("СОБАКА: " + name + " пробежал(а) " + runDistance + " метров.");
        else if (runDistance > MAX_RUN_DISTANCE) {
            System.out.println("СОБАКА: " + name + " не может пробежать больше " + MAX_RUN_DISTANCE + " метров за один раз.");
        } else {
            System.out.println("Ошибка! Расстояние не может быть отрицательным.");
        }
    }
}
