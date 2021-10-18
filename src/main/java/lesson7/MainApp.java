package lesson7;

public class MainApp {

    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Сэм"),
                new Cat("Космос"),
                new Cat("Мурзик"),
                new Cat("Барсик")
        };
        Plate plate = new Plate(17);
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
            cats[i].info();
            System.out.println();
        }
        plate.addFoodToPlate(12);
        plate.info();
    }
}
