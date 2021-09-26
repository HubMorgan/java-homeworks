package lesson2;

public class Main {

    private static boolean checkSumInRange (int a, int b) { //задача №1
        return (a + b >= 10 && a + b <= 20);
    }

    private static void checkNumForPosOrNeg (int a) { //задача №2
        System.out.println(a >= 0 ? "Число " + a + " положительное" : "Число " + a + " отрицательное");
    }

    private static boolean checkNumWithBoolean (int a) { //задача №3
        return a <= 0;
    }

    private static void spammer (int a, String s) { //задача №4
        for (int i = 0; i < a; i++) {
            System.out.println(s);
        }
    }

    private static boolean isLeap (int a) {
        if (a != 0 && a % 100 != 0 && a % 400 == 0) {
            System.out.println(a + " - это високосный год!");
            return true;
        } else if (a != 0 && a % 4 == 0) {
            System.out.println(a + " - это високосный год!");
            return true;
        } else {
            System.out.println(a + " - это не високосный год!");
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("Задача №1");
        System.out.println(checkSumInRange(5,12)); //задача №1
        System.out.println();


        System.out.println("Задача №2");
        checkNumForPosOrNeg(-23); //задача №2
        System.out.println();


        System.out.println("Задача №3");
        System.out.println(checkNumWithBoolean(-443)); //задача №3
        System.out.println();

        System.out.println("Задача №4");
        spammer(3, "I love Java!"); //задача №4
        System.out.println();

        System.out.println("Задача №5"); //задача №5
        System.out.println(isLeap(0 ));



    }
}
