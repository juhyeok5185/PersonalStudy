import java.util.Scanner;

//가격 확인 버튼을 누르면 실시간으로 가격변동이 보일수있게 만들기
public class user {
    public static void main(String[] args) {
        TreadEx treadEx = new TreadEx();
        treadEx.threadStart();
        int money = 0;
        int nowBitcoinPrice = 23000000;
        Scanner scanner = new Scanner(System.in);

        out: while (true) {
            System.out.println("1.입금  2.출금  3.구매  4.자산 5.가격");
            int selectMenu = scanner.nextInt();
            switch (selectMenu) {
                case 1:
                    System.out.println("입금금액 : ");
                    int depositMoney = scanner.nextInt();
                    money += depositMoney;
                    System.out.println("잔액 : " + money);
                    break;
                case 2:
                    System.out.println("출금금액 : ");
                    int withdrawalMoney = scanner.nextInt();
                    money -= withdrawalMoney;
                    System.out.println("잔액 : " + money);
                    break;
                case 3:
                    System.out.println("구매");
                    System.out.println("현재 비트코인 가격" + nowBitcoinPrice);
                    System.out.println("최대 구매수량" + money / nowBitcoinPrice);
                    int ea = scanner.nextInt();
                    money -= ea * nowBitcoinPrice;
                    System.out.println(ea + "개 체결 남은잔액 : " + money);
                    break;
                case 4:
                    System.out.println("1.수익률 2.예수금 3.총자산");
                    System.out.println("잔액 : " + money);
                    System.out.println();
                    break;
                case 5:

                    break;
            }
        }
    }
}
