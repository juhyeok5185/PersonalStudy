public class methodExam1 {
    public static void main(String[] args) {
        int d = helloJavaPrint(3);
        int num = numCul(10);
        System.out.println(num);
    }

    public static int helloJavaPrint(int a) {
        System.out.println("HelloJavaPrint 호출");
        return a;
    }

    public static int numCul(int a) {
        int answer = 0;
        for (int i = 0; i <= a; i++) {
            if (i % 2 != 0) {
                answer += i;
            }
        }
        return answer;
    }

    public static char convertChar(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            ch += 32;
        }
        return ch;

    }
}
