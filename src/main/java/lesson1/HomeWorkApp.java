package lesson1;

public class HomeWorkApp {

    private static void compareNumbers(int a, int b) {
        if (a >= b) {
            System.out.println(a + " >= " + b);
        } else {
            System.out.println(a + " < " + b);
        }
    }

    private static void printColor() {
        int color = 85;
        if (color <= 0) {
            System.out.println("Красный");
        } else if (color > 0 && color <= 101) {
            System.out.println("Жёлтый");
        } else {
            System.out.println("Зелёный");
        }
        System.out.println();
    }

    private static void checkSumSign() {
        int a = 34, b = 23;
        int result = a+b;
        if(result >= 0) {
            System.out.println("Сумма положительная. Результат: " + result);
        } else {
            System.out.println("Сумма отрицательная. Результат: " + result);
        }
        System.out.println();
    }

    private static void printThreeWords(){
        System.out.println("Orange\nBanana\nApple");
        System.out.println();
    }

    public static void main(String[] args) {
        printThreeWords();
        printColor();
        checkSumSign();
        compareNumbers(1, 5);
    }
}
