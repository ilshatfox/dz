import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.println("Выбери задачу 1-3: ");
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
            } else {
                System.out.println("Не знаю такого ответа");
            }
        }
    }
    public static void task1() {
        Scanner in = new Scanner(System.in);
        System.out.print("Сколько челых чисел введешь?: ");
        int num = in.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.print("Введи челое число: ");
            int num2 = in.nextInt();
            arr[i] = num2;
        }
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sum1 += arr[i];
            } else {
                sum2 += arr[i];
            }
        }
        System.out.println("Разность:" + (sum1-sum2));

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
        int max = arr[0];
        int max2 = arr[1];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max2 = max;
                max = arr[i];
            }
        }
        System.out.println("Самое большое число: " + max);
        System.out.println("Второе по величине: " + max2);
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
        int num1 = arr[0];
        int num2 = arr[1];
        int difference = Math.abs(num1-num2);
        for (int i = 0; i < arr.length-1; i++) {
            int difference1 = arr[i] - arr[i+1];
            int difference2 = arr[i+1] - arr[i];
            if (difference1 < difference) {
                difference = difference1;
                num1 = arr[i];
                num2 = arr[i + 1];
            }
            if (difference2 < difference) {
                difference = difference2;
                num1 = arr[i];
                num2 = arr[i + 1];
            }
        }
        System.out.println("Разность между ними минимальна: " + num1 + " " + num2);
    }

    public static void task4() {
        Scanner in = new Scanner(System.in);
        System.out.print("Сколько челых чисел введешь?: ");
        int num = in.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.print("Введи челое число: ");
            int num2 = in.nextInt();
            arr[i] = num2;
        }
        int max = 0;
        int mNum = 0;
        for (int i = 0; i < arr.length; i++) {
            int n = arr[i];
            int sum = 0;
            while(n != 0){
                sum += (n % 10);
                n/=10;
            }

            if (sum > max) {
                max = sum;
                mNum = arr[i];
            }
        }
        System.out.println(mNum);
    }

    public static void task5() {
        Scanner in = new Scanner(System.in);
        System.out.print("Сколько челых чисел введешь?: ");
        int num = in.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.print("Введи челое число: ");
            int num2 = in.nextInt();
            arr[i] = num2;
        }
        for (int i = 1; i < arr.length-1; i++) {
            if (arr[i] > arr[i - 1] & arr[i] > arr[i + 1]) {
                System.out.println(arr[i]);
            }
        }
    }
}