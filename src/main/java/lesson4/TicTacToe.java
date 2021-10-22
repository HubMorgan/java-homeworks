package lesson4;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    private static Scanner scanner;
    private static Random random;

    private static char[][] map; //массив для игрового поля
    private static final int SIZE = 5; //переменная для размера поля
    public static final char MAP_ELEMENT_EMPTY = '_'; //переменная для свободных клеток
    private static final char MAP_ELEMENT_X = 'X'; //переменная для крестиков
    public static final char MAP_ELEMENT_0 = '0'; //переменная для ноликов

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        random = new Random();
        initMap();
        printMap();
        while (true) {
            playerTurn();
            printMap();
            if(checkWin((MAP_ELEMENT_X))) {
                System.out.println("Игра окончена! Победил игрок!");
                break;
            }
            if(isMapFull()) {
                System.out.println("Игра окончена. Ничья!");
                break;
            }
            aiTurn();
            printMap();
            if(checkWin((MAP_ELEMENT_0))) {
                System.out.println("Игра окончена! Победил AI!");
                break;
            }
            if(isMapFull()) {
                System.out.println("Игра окончена. Ничья!");
                break;
            }
        }
    }

    public static boolean checkWin(char element) {                                 //проверка на выигрыш

        if (SIZE == 5) {
        //Проверка на выигрыш из 4 фишек для поля 5x5

        //-------------------вертикали для 5х5-----------------------------


            int count = 0;
            for (int i = 0; i < SIZE; i++) {
                if (count >= 4) {
                    return true;
                }
                count = 0;
                for (int j = 0; j < SIZE; j++) {
                    if (j > 0 && j < SIZE - 1 && map[i][j] != element) {
                        break;
                    }

                    if (map[i][j] == element) {
                        count++;
                    }
                }
            }

            //-------------------горизонтали для 5х5-----------------------------

            for (int i = 0; i < SIZE; i++) {
                if (count >= 4) {
                    return true;
                }
                count = 0;
                for (int j = 0; j < SIZE; j++) {
                    if (j > 0 && j < SIZE - 1 && map[j][i] != element) {
                        break;
                    }

                    if (map[j][i] == element) {
                        count++;
                    }
                }
            }

            //-------------------малая левая диагональ для 5х5-----------------------------

            for (int i = 0, j = 1; j < SIZE; i++, j++) {
                if (map[i][j] != element) {
                    break;
                }
                if (map[i][j] == element) {
                    count++;
                    if (count >= 4) {
                        return true;
                    }
                }
            }

            count = 0;
            //-------------------малая правая диагональ для 5х5-----------------------------

            for (int i = SIZE - 1, j = 1; j < SIZE; i--, j++) {
                if (map[i][j] != element) {
                    break;
                }
                if (map[i][j] == element) {
                    count++;
                    if (count >= 4) {
                        return true;
                    }
                }
            }

            count = 0;

            //-------------------большая левая диагональ для 5х5-----------------------------

            for (int i = 0, j = 0; j < SIZE; i++, j++) {
                if (map[i][j] != element) {
                    break;
                }
                if (map[i][j] == element) {
                    count++;
                    if (count >= 4) {
                        return true;
                    }
                }
            }

            count = 0;

            //-------------------большая правая диагональ для 5х5-----------------------------

            for (int i = SIZE - 1, j = 0; j < SIZE; i--, j++) {
                if (map[i][j] != element) {
                    break;
                }
                if (map[i][j] == element) {
                    count++;
                    if (count >= 4) {
                        return true;
                    }
                }
            }

            count = 0;

            //-------------------малая левая диагональ2 для 5х5-----------------------------

            for (int i = 0, j = SIZE - 2; j >= 0; i++, j--) {
                if (map[i][j] != element) {
                    break;
                }
                if (map[i][j] == element) {
                    count++;
                    if (count >= 4) {
                        return true;
                    }
                }
            }

            count = 0;


            //-------------------малая правая диагональ2 для 5х5-----------------------------

            for (int i = SIZE - 1, j = SIZE - 2; j >= 0; i--, j--) {
                if (map[i][j] != element) {
                    break;
                }
                if (map[i][j] == element) {
                    count++;
                    if (count >= 4) {
                        return true;
                    }
                }
            }
        }

    //-------------------вертикали-----------------------------
        for (int i = 0; i < SIZE; i++) {
        for (int j = 0; map[i][j] == element; j++) {
            if (j == SIZE-1 && map[i][j] == element) {
                return true;
            }
        }
    }

//--------------------горизонтали-----------------------------
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; map[j][i] == element; j++) {
                if (j == SIZE-1 && map[j][i] == element) {
                    return true;
                }
            }
        }
//--------------диагональ слева на право-----------------------------
            for (int i = 0, j = 0; map[j][i] == element && j < SIZE; j++, i++) {
                if (j == SIZE-1 && map[j][i] == element) {
                    return true;
                }
            }
//--------------диагональ справа на лево-----------------------------

        for (int i = 0, j = SIZE-1; map[j][i] == element && j < SIZE; j--, i++) {
            if (j == 0 && map[j][i] == element) {
                return true;
            }
        }
        return false;
    }

    public static boolean isMapFull(){                                 //проверка на свободную клетку
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if(map[i][j] == MAP_ELEMENT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void aiTurn() {                                 //ход ИИ
        int x,y;

        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
            random.nextInt();
        } while (!isMoveValid(x,y));

        map[x][y] = MAP_ELEMENT_0;
        System.out.println("AI походил в клетку [ " + x + ", " + y + " ]" );

    }

    public static boolean isMoveValid(int x, int y) {               //проверка на введенное значение для хода
        if(x < 0 || y < 0 || x >= SIZE || y >= SIZE) {
            return false;
        }
        if(map[x][y] != MAP_ELEMENT_EMPTY) {
            return false;
        }
        return true;
    }

    public static void playerTurn() {                                 //ход игрока
        int x, y;

        do {
            System.out.println("Введите координаты вашего хода в формате: X, Y");

            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isMoveValid(x,y));

        if(isMoveValid(x,y)) {
            map[x][y] = MAP_ELEMENT_X;
        } else {
            System.out.println("Координаты не верны, попробуйте ещё раз!");

        }


    }

    public static void printMap() {                             //вывод поля на экран
        System.out.print("  ");
        for (int i = 1; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i+1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[j][i] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void initMap() {                              //инициализация игрового поля
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = MAP_ELEMENT_EMPTY;
            }

        }
    }
}
