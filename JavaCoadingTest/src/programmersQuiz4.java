public class programmersQuiz4 {

//    머쓱이네 양꼬치 가게는 10인분을 먹으면 음료수 하나를 서비스로 줍니다.
//    양꼬치는 1인분에 12,000원, 음료수는 2,000원입니다. 정수 n과 k가 매개변수로
//    주어졌을 때, 양꼬치 n인분과 음료수 k개를 먹었다면 총얼마를
//    지불해야 하는지 return 하도록 solution 함수를 완성해보세요.

//    0 < n < 1,000
//    n / 10 ≤ k < 1,000
//    서비스로 받은 음료수는 모두 마십니다.

    public static void main(String[] args) {
        programmersQuiz4 pro = new programmersQuiz4();
        pro.solution(64,6);
    }

    public int solution(int n, int k) {

        int answer = 0;
        int meat = n * 12000;
        int juice = k * 2000;
        int serviceCnt = n/10;
        boolean service = false;

        if(serviceCnt >= 1){
            service = true;
            juice = juice - (serviceCnt*2000);
            service = false;
        }

        answer = juice + meat;
        System.out.println(answer);
        return answer;

       // return n * 12000 + k * 2000 - (n / 10 * 2000);

    }
}
