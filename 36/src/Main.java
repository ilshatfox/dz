
import java.util.Random;

public class Main {
        public static int sum = 0;

        public static void main(String[] args) {

            Random rand = new Random();

            int mainSum = 0;
            int[] arr = new int[1000000];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = rand.nextInt(10000);
//                System.out.println(n[i]);
                mainSum += arr[i];
            }

            System.out.println(mainSum);

            CounterThread counterThread1 = new CounterThread(0, 100000, arr);
                CounterThread counterThread2 = new CounterThread(100000, 200000, arr);
            CounterThread counterThread3 = new CounterThread(200000, 300000, arr);
            CounterThread counterThread4 = new CounterThread(300000, 400000, arr);
            CounterThread counterThread5 = new CounterThread(400000, 500000, arr);
            CounterThread counterThread7 = new CounterThread(500000, 600000, arr);
            CounterThread counterThread8 = new CounterThread(600000, 7000000, arr);
            CounterThread counterThread9 = new CounterThread(700000, 800000, arr);
            CounterThread counterThread9 = new CounterThread(800000, 900000, arr);
            CounterThread counterThread10 = new CounterThread(900000, 1000000, arr);

            counterThread1.start();
            counterThread2.start();
            counterThread3.start();
            counterThread4.start();
            counterThread5.start();
            counterThread6.start();
            counterThread7.start();
            counterThread8.start();
            counterThread9.start();
            counterThread10.start();
            System.out.println(sum);
    }
}
