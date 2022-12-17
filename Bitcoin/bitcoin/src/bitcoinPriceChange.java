import java.util.Random;
import java.time.LocalDateTime;

public class bitcoinPriceChange {
    public static void main(String[] args) {
        int myMoney = 100000000;
        int buyEa = 0;
        int wallet = 0;
        int todayStartPrice = 20000000;
        int bitcoinPrice = 20000000;
        int cnt = 0;

        while (true) {
            int randomNum = new Random().nextInt(600000) - 230000;
            bitcoinPrice += randomNum;
            int avn = -(todayStartPrice - bitcoinPrice);
            float avg = ((float) avn / todayStartPrice) * 100;

            wallet = myMoney + (buyEa * bitcoinPrice);

            if (avg > 1.0f && buyEa != 0) {
                myMoney = buyEa * bitcoinPrice;
                buyEa = 0;
                System.out.println("매도되었습니다");
                System.out.printf("매도가 : %d /  총 : %d개", bitcoinPrice, buyEa);

            } else if (avg < -1.0f && myMoney > bitcoinPrice) {

                buyEa = myMoney / bitcoinPrice;
                myMoney = myMoney % bitcoinPrice;
                System.out.println("체결되었습니다.");
                System.out.printf("체결가 : %d /  총 : %d개\n", bitcoinPrice, buyEa);
            }

            System.out.printf("비트코인가격 : %d , 전일대비 : %d (%f) 현재Wallet : %d\n", bitcoinPrice, avn, avg, wallet);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
