import java.util.Arrays;

public class programmersQuiz9 {
//
//    정수 배열 numbers와 정수 num1, num2가 매개변수로 주어질 때,
//    numbers의 num1번 째 인덱스부터 num2번째 인덱스까지 자른 정수
//        배열을 return 하도록 solution 함수를 완성해보세요.
public static void main(String[] args) {
    int[] arr = {1,3,4,5,4,6,7,8,4,3,1,3,5,34,2,45,45,253,42,6,4,3};
    programmersQuiz9 pro = new programmersQuiz9();
    pro.solution(arr,3,15);
}
        public int[] solution(int[] numbers, int num1, int num2) {
            int[] answer = new int[num2 - num1 + 1];

            for (int i = num1; i <= num2; i++) {
                answer[i -num1] = numbers[i];
            }
            System.out.println(Arrays.toString(answer));
            return answer;
        }
//        public int[] solution(int[] numbers, int num1, int num2) {
//            return Arrays.copyOfRange(numbers, num1, num2 + 1);
//        }

}
