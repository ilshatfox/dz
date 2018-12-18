import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.println("Выбери задачу 1-6: ");
            int num = in.nextInt();
            if (num == 1) {
                task1();
            } else if (num == 2) {
                task2();
            } else if (num == 3) {
                task3();
            } else if (num == 4) {
                task4();
            } else if (num == 5) {
                task5();
            } else if (num == 6) {
                task6();
            } else {
                System.out.println("Не знаю такого ответа");
            }
        }
    }

    public static void task1() {
        Scanner in = new Scanner(System.in);
        System.out.print("Число студентов: ");
        int num = in.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.print("Введи челое число: ");
            int num2 = in.nextInt();
            arr[i] = num2;
        }
        double all = 0;
        for (int i = 0; i < arr.length; i++) {
            all += arr[i];
        }
        double average = all/arr.length;

        int moreAverage = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > average) {
                moreAverage += 1;
            }
        }
        System.out.println("Средний рост:" + average);
        System.out.println("Выше среднего роста: " + moreAverage);

    }

    public static void task2() {
        Scanner in = new Scanner(System.in);
        System.out.print("Сколько челых чисел введешь?: ");
        int num = in.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.print("Введи челое число: ");
            int num2 = in.nextInt();
            arr[i] = num2;
        }
        int max = Math.abs(arr[0]);
        for (int i = 0; i < arr.length; i++) {
            if (Math.abs(arr[i]) > max) {
                max = arr[i];
            }
        }
        System.out.println("Самое большое число: " + max);
    }

    public static void task3() {
        Scanner in = new Scanner(System.in);
        System.out.print("Сколько челых чисел введешь?: ");
        int num = in.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.print("Введи челое число: ");
            int num2 = in.nextInt();
            arr[i] = num2;
        }

        int numA = 0;
        for (int i = 1; i < arr.length-1; i++) {
            if (arr[i] > arr[i - 1] & arr[i] > arr[i + 1]) {
                numA += 1;
            }
        }
        System.out.println("Количество локальных максимумов: " + numA);
    }

    public static void task4() { // Не сделано
        Scanner in = new Scanner(System.in);
        System.out.print("Сколько челых чисел введешь?: ");
        int num = in.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.print("Введи челое число: ");
            int num2 = in.nextInt();
            arr[i] = num2;
        }
        int st = 0;
        boolean test = true;
        for (int i = 0; i < arr.length-1; i++) {
            if (st == 0) {
                if (arr[i] > arr[i + 1]) {
                    st = 1;
                }
            } else {
                if (arr[i] < arr[i + 1]) {
                    test = false;
                }
            }
        }
        System.out.println("test: " + test);
    }

    public static void task5() {
        Scanner in = new Scanner(System.in);
        System.out.print("Сколько челых чисел введешь?: ");
        int num = in.nextInt();
        String[] arr = new String[num];
        for (int i = 0; i < num; i++) {
            System.out.print("Введи челое число: ");
            String num2 = in.nextLine();
            arr[i] = num2;
        }
        String num2 = "";
        for (int i = 0; i < arr.length; i++) {
            num2 += arr[i];
        }
        int num3 = Integer.parseInt(num2);
        System.out.println(num3);
    }

    public static void task6() {
        Scanner in = new Scanner(System.in);
        System.out.print("Сколько челых чисел введешь?: ");
        int num = in.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.print("Введи челое число: ");
            int num2 = in.nextInt();
            arr[i] = num2;
        }
        for (int i = 0; i < arr.length/2; i++) {
            int t = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = t;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n");
    }
}