import java.util.Arrays;
import java.util.Collections;

public class programmersQuiz15 {
//    정수 배열 numbers가 매개변수로 주어집니다.
//    numbers의 원소 중 두 개를 곱해 만들 수 있는
//    최댓값을 return하도록 solution 함수를 완성해주세요.
    public static void main(String[] args) {
        int[] arr = {1,3,5,6,7,8,9};
        programmersQuiz15 pro = new programmersQuiz15();
        pro.solution(arr);
    }
    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
        answer = numbers[numbers.length -1] * numbers[numbers.length -2];
        return answer;
    }
}
