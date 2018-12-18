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
            } else {
                System.out.println("Не знаю такого ответа");
            }
        }
    }
    public static void task1() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введи первое число: ");
        int num = in.nextInt();

        System.out.print("Введи второе число: ");
        int num2 = in.nextInt();

        int num3 = Math.abs(num-num2);
        System.out.println(num3);
    }

    public static void task2() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введи радиус шара: ");
        double r = in.nextInt();

        if (r > 0) {
            double num2 = (1/3) * Math.PI * r*r*r;
            System.out.println("Объем шара: " + num2);

            double num3 = 4 * Math.PI * r*r;
            System.out.println("Площадь поверхности шара: " + num3);
        } else {
            System.out.println("Число должно быть больше 0!");
        }
    }

    public static void task3() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введи целое число от 0 до 255: ");
        int num = in.nextInt();
        if ( num > 0 & num < 255) {
            System.out.println("Двоичное число:" + Integer.toBinaryString(num));
        } else {
            System.out.println("Число меньше 0 или больше 255");
        }
    }
}