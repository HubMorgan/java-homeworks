package lesson6.animals;

public abstract class Animal {
    private String name;
    private static int animalCount;
    static int dogCount;
    static int catCount;

    protected Animal (String name){
        this.name = name;
        animalCount++;
    }

    public static int getAnimalCount() {
        return animalCount;
    }

    public static void showAnimalCountInfo() {
        System.out.println();
        System.out.println("****** ОТЧЕТ ПО ЖИВОТНЫМ ******");
        System.out.println("Всего животных создано: " + animalCount);
        System.out.println("Из них " + dogCount + " собак и " + catCount + " кошек.");
    }

    public abstract void swim(int swimDistance);

    public abstract void run(int runDistance);
}
