package lesson3;
import java.util.Arrays;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {

                    //задание №1

        System.out.println("Задание №1");
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Массив до изменения: ");
        System.out.println(Arrays.toString(array));
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i]++;
            } else {
                array[i]--;
            }
        }
        System.out.println("Массив после изменения: ");
        System.out.println(Arrays.toString(array));
        System.out.println("\n\n");

                    //задание №2

        System.out.println("Задание №2");
        int[] array2 = new int[100];
        System.out.println("Массив до заполнения: ");
        System.out.println(Arrays.toString(array2));
        System.out.println();
        for (int i = 0; i < array2.length; i++) {
            array2[i] = i+1;
        }
        System.out.println("Массив после заполнения: ");
        System.out.println(Arrays.toString(array2));
        System.out.println("\n\n");


                    //задание №3

        System.out.println("Задание №3");
        int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Массив до изменения: ");
        System.out.println(Arrays.toString(array3));
        System.out.println();
        for (int i = 0; i < array3.length ; i++) {
            if (array3[i] < 6) {
                array3[i] *= 2;
            }
        }

        System.out.println("Массив после изменения: ");
        System.out.println(Arrays.toString(array3));
        System.out.println("\n\n");


                    //задание №4

        System.out.println("Задание №4");

        int[][] array4 = new int[5][5];

        for (int i = 0; i < array4.length; i++) {
            for (int j = 0; j < array4[i].length; j++) {
                array4[i][j] = 0;                           //заполнение массива
            }
        }
        System.out.println("Массив до изменения: ");
        for (int i = 0; i < array4.length ; i++) {
            System.out.println(Arrays.toString(array4[i])); //вывод массива в консоль
        }
        System.out.println();
        System.out.println();

        System.out.println("Массив после изменения: ");
        for (int i = 0; i < array4.length; i++) {
            for (int j = 0, t = array4.length-1; j < array4.length; j++, t--) {
                    array4[i][j] = 1;
                    array4[i][t] = 1;
                    i++;
            }
        }

        for (int i = 0; i < array4.length ; i++) {
            System.out.println(Arrays.toString(array4[i])); //вывод массива в консоль
        }
        System.out.println("\n\n");

                   //задание №5

        System.out.println("Задание №5");
        System.out.println("Создан и заполнен массив при помощи метода: ");
        System.out.println(Arrays.toString(ArrayMaker(10, 2)));
        System.out.println("\n\n");

                    //задание №6

        System.out.println("Задание №6");
        int[] array6 = {-23, -123, -365, -656, 13, -26, -19, 88, -69, 98};
        System.out.println("Инициализирован новый массив: ");
        int min = array6[0];
        int max = array6[0];
        for (int i = 0; i < array6.length; i++) {
            if (array6[i] < min) {
                min = array6[i];
            } else if (array6[i] > max) {
                max = array6[i];
            }
        }
        System.out.println(Arrays.toString(array6));
        System.out.println("Минимальный элемент в этом массиве: " + min);
        System.out.println("Максимальный элемент в этом массиве: " + max);
        System.out.println("\n\n");

                    //задание №7

        System.out.println("Задание №7");
        System.out.println(comparePartsOfArray(new int[] {13,15,23,33,33,55,11,5,3,4,6,2,3,66}));
        System.out.println("\n\n");


                    //задание №8

        System.out.println("Задание №8");
        arrayShifter(new int[] {1,2,3,4,5,6,7,8}, 7);
        arrayShifter(new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15}, -26);

    }


    public static int[] ArrayMaker(int len, int initialValue) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        len = sc.nextInt();
        System.out.println();
        System.out.print("Введите число, которым будут заполнениы элементы массива: ");
        initialValue = sc.nextInt();
        sc.close();
        System.out.println();
        int[] array5 = new int [len];
        for (int i = 0; i < array5.length; i++) {
            array5[i] = initialValue;
        }
        return array5;
    }

    public static boolean comparePartsOfArray(int[] array) {
        int sum1 = 0;
        int sum2 = 0;
            for (int i = array.length-1; i != 0; i--) {
                if (sum1 == sum2 && sum1 != 0){
                    break;
                }

                sum1 += array[i];

                for (int j = 0; j < array.length; j++) {
                    if (sum1 == sum2) {
                        break;
                    }
                    if (i != j) {
                        sum2 += array[j];
                    } else {
                        sum2 = 0;
                        break;
                    }
                }
            }

        System.out.println(sum1 + " " + sum2);
        return sum1 == sum2;

    }

    public static void arrayShifter(int[] array, int shift) {
        int arrLength = array.length;

        for(int i = 0; i > shift; i--) {
            int temp = array[0];
            for(int k = 0; k < arrLength-1; k++) {
                array[k] = array[k+1];
            }
            array[arrLength-1] = temp;
        }

        for (int i = 0; i < shift; i++) {
            int temp = array[arrLength-1];
            for (int j = arrLength-1; j > 0 ; j--) {
                array[j] = array[j-1];
            }
            array[0] = temp;
        }

        System.out.println(Arrays.toString(array));
    }

}