import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] massive1 = new int[3];
        massive1[0] = 1;
        massive1[1] = 2;
        massive1[2] = 3;
        double[] massive2 = {1.57, 7.654, 9.986};
        int[] massive3 = new int[12];


    }


    public static void task2() {
        System.out.println("Задача 2");
        int[] massive1 = new int[3];
        massive1[0] = 1;
        massive1[1] = 2;
        massive1[2] = 3;
        double[] massive2 = {1.57, 7.654, 9.986};
        int[] massive3 = new int[2];
        System.out.println("Первый массив");
        for (int i = 0; i < massive1.length; i++) {
            System.out.print(massive1[i]);
            if (i != massive1.length - 1) {
                System.out.println(", ");
            }
        }
        System.out.println();
        System.out.println("Второй массив");
        for (int i = 0; i < massive2.length; i++) {
            System.out.print(massive2[i]);
            if (i != massive2.length - 1) {
                System.out.println(", ");
            }
        }
        System.out.println();
        System.out.println("Третий массив");
        for (int i = 0; i < massive3.length; i++) {
            System.out.print(massive3[i]);
            if (i != massive3.length - 1) {
                System.out.println(", ");
            }
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] massive1 = new int[3];
        massive1[0] = 1;
        massive1[1] = 2;
        massive1[2] = 3;
        double[] massive2 = {1.57, 7.654, 9.986};
        int[] massive3 = new int[2];
        System.out.println("Первый массив");
        for (int i = massive1.length - 1; i >= 0; i--) {
            System.out.print(massive1[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("Второй массив");
        for (int i = massive2.length - 1; i >= 0; i--) {
            System.out.print(massive2[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("Третий массив");
        for (int i = massive3.length - 1; i >= 0; i--) {
            System.out.print(massive3[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }


    public static void task4() {
        System.out.println("Задача 4");
        int[] massive1 = new int[3];
        massive1[0] = 1;
        massive1[1] = 2;
        massive1[2] = 3;
        double[] massive2 = {1.57, 7.654, 9.986};
        int[] massive3 = {3, 5, 6, 7, 8, 9};
        for (int i = 0; i < massive3.length; i++) {
            if (massive3[i] % 2 == 1) {
                massive3[i]++;


            }


        }
        System.out.println(Arrays.toString(massive3));
    }
}


