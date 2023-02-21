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
        int firstMassive = massive1[0];
        int secondMassive = massive1[1];
        int thirdMassive = massive1[2];
        double[] massive2 = {1.57, 7.654, 9.986};
        int[] massive3 = new int[12];
        System.out.println(massive1[1]);
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] massive1 = new int[3];
        double[] massive2 = {1.57, 7.654, 9.986};
        int[] massive3 = new int[2];
        System.out.println(massive1[0] + ", " + massive1[1] + ", " + massive1[2]);
        System.out.println(massive2[0] + ", " + massive2[1] + ", " + massive2[2]);
        System.out.println(massive3[0] + ", " + massive3[1]);
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] massive1 = new int[3];
        double[] massive2 = {1.57, 7.654, 9.986};
        int[] massive3 = new int[2];
        System.out.println(massive1[2] + ", " + massive1[1] + ", " + massive1[0]);
        System.out.println(massive2[2] + ", " + massive2[1] + ", " + massive2[0]);
        System.out.println(massive3[1] + ", " + massive3[0]);
    }

    public static void task4() {
        System.out.println("Задача 4");
        int[] massive1 = new int[3];
        massive1[0] = 1;
        massive1[1] = 2;
        massive1[2] = 3;
        int firstMassive = massive1[0];
        int secondMassive = massive1[1];
        int thirdMassive = massive1[2];
        double[] massive2 = {1.57, 7.654, 9.986};
        int[] massive3 = {3, 5, 6, 7, 8, 9};
        for (int i = 0; i < massive3.length; i++) {
            if (massive3[i] % 2 == 1) {
                massive3[i]++;

                System.out.println(massive3[i] + " ");


            }

        }
    }
}


