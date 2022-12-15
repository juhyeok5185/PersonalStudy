import java.util.Random;
import java.time.LocalDateTime;

public class TreadEx {
    void threadStart() {
        Thread thread = new MyThread();

        thread.start();

    }

    static class MyThread extends Thread {
        @Override
        public void run() {
            int todayStartPrice = 2300000;
            int bitcoinPrice = 2300000;
            while (true) {
                int randomNum = new Random().nextInt(600000) - 250000;
                bitcoinPrice += randomNum;
                int avn = -(todayStartPrice - bitcoinPrice);
                float avg = ((float) avn / todayStartPrice);

                System.out.printf("비트코인가격 : %d , 전일대비 : %d (%f)\n", bitcoinPrice, avn, avg);
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
