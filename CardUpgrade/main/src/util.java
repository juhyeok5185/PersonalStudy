import java.util.Random;
import java.util.Scanner;

import javax.security.auth.login.LoginContext;

public class util {
    static PlayerCard playerCard = new PlayerCard();
    static PlayerCard[] player = new PlayerCard[100];
    static user u = new user();
    static boolean run = true;
    static user[] userArr = new user[100];
    static int cnt = 0;
    static int cardCnt = 0;
    static int userCardCnt = 0;
    static boolean loginCk = false;
    static boolean managerMode = false;
    static int menuNum = 0;

    public static void Start() {
        Scanner scanner = new Scanner(System.in);
        while (run) {
            menuNum = MainMenu(loginCk, managerMode);
            switch (menuNum) {
                case 1:
                    if (loginCk) {
                        UserBuy();
                        break;
                    } else if (managerMode) {
                        CardRegister();
                        break;
                    } else {
                        String loginId = InputString("ID : ");
                        String loginPw = InputString("PW : ");
                        ManagerModeLogin(loginId, loginPw);
                        UserModeLogin(loginId, loginPw);
                        break;
                    }
                case 2:
                    if (loginCk) {
                        System.out.println("카드강화 준비중");
                    } else if (managerMode) {
                        PlayerList();
                        continue;
                    } else {
                        cnt = UserJoin();
                    }
                    break;
                case 3:
                    if (loginCk) {
                        System.out.println("잔액");
                    } else if (managerMode) {
                        managerMode = false;
                    }
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    for (int i = 0; i < userCardCnt; i++) {
                        System.out.println(
                                "이름 : " + u.playerCards[i].name + "| 가격 : " + u.playerCards[i].price);
                    }
                    break;
                case 7:
                    loginCk = false;
                    continue;
            }
            continue;
        }
    }

    public static int MainMenu(boolean loginCk, boolean managerMode) {
        Scanner scanner = new Scanner(System.in);
        if (loginCk) {
            System.out.println("1.카드뽑기 2.카드강화 3.잔액 4.입금 5.출금 6.내카드목록 7.로그아웃");
        } else if (managerMode) {
            System.out.println("1.선수등록 2.선수목록 3.종료");
        } else {
            System.out.println("1.로그인 2.회원가입");
        }
        int menuNum = scanner.nextInt();
        scanner.nextLine();
        return menuNum;
    }

    public static void UserBuy() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.1000원 2.종료");
        int menuNum = scanner.nextInt();
        scanner.nextLine();
        switch (menuNum) {
            case 1:
                Random random = new Random();
                System.out.println("구매");
                int ran = random.nextInt(cardCnt);
                System.out.println(player[ran].name);
                u.playerCards[userCardCnt] = player[ran];
                userCardCnt++;
                break;
            case 2:
                break;
        }
    }

    public static void CardRegister() {
        Scanner scanner = new Scanner(System.in);
        playerCard = new PlayerCard();
        System.out.println("선수이름 : ");
        playerCard.name = scanner.next();
        System.out.println("선수가치 : ");
        playerCard.price = scanner.nextInt();
        player[cardCnt] = playerCard;
        cardCnt++;
    }

    public static String InputString(String a) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(a);
        return scanner.next();
    }

    public static boolean ManagerModeLogin(String loginId, String loginPw) {
        if (loginId.equals("test") && loginPw.equals("1234")) {
            System.out.println("관리자로그인");
            managerMode = true;
        }
        return managerMode;
    }

    public static boolean UserModeLogin(String loginId, String loginPw) {
        for (int i = 0; i < cnt; i++) {
            if (loginId.equals(userArr[i].id) && loginPw.equals(userArr[i].pw)) {
                System.out.println("로그인완료");
                loginCk = true;
                break;
            } else {
                System.out.println("정보를 확인해주세요");
            }
        }
        return loginCk;
    }

    public static void PlayerList() {
        for (int i = 0; i < cardCnt; i++) {
            System.out.println("이름 : " + player[i].name + "| 가격 : " + player[i].price);
        }
    }

    public static int UserJoin() {
        Scanner scanner = new Scanner(System.in);
        u = new user();
        System.out.println("Name : ");
        u.name = scanner.next();
        System.out.println("ID : ");
        u.id = scanner.next();
        System.out.println("PW : ");
        u.pw = scanner.next();
        userArr[cnt] = u;
        cnt++;
        return cnt;
    }
}
