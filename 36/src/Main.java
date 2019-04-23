
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

            CounterThread counterThread1 = new CounterThread(0, 200000, arr);
            CounterThread counterThread2 = new CounterThread(200000, 400000, arr);
            CounterThread counterThread3 = new CounterThread(400000, 600000, arr);
            CounterThread counterThread4 = new CounterThread(600000, 800000, arr);
            CounterThread counterThread5 = new CounterThread(800000, 1000000, arr);

            counterThread1.run();
            counterThread2.run();
            counterThread3.run();
            counterThread4.run();
            counterThread5.run();
            System.out.println(sum);
    }
}
