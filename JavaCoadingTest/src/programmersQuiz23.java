import java.util.Arrays;

public class programmersQuiz23 {
//    정수 n이 매개변수로 주어질 때,
//    n 이하의 홀수가 오름차순으로 담긴 배열을
//    return하도록 solution 함수를 완성해주세요.
    public static void main(String[] args) {
        programmersQuiz23 pro = new programmersQuiz23();
        pro.solution(10);
    }

    public int[] solution(int n) {
        int count = ((n % 2) == 0) ? (n / 2) : ((n / 2) + 1);

        int[] answer = new int[count];
        int index = 0;

        for (int i = 1; i <= n; i++) {

            if ((i % 2) == 1) {

                answer[index] = i;
                index++;
            }
        }

        return answer;
    }
}
