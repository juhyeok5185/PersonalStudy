public class programmersQuiz3 {
//    정수 배열 numbers가 매개변수로 주어집니다.
//    numbers의 원소의 평균값을 return하도록
//    solution 함수를 완성해주세요.

//    0 ≤ numbers의 원소 ≤ 1,000
//    1 ≤ numbers의 길이 ≤ 100
//    정답의 소수 부분이 .0 또는 .5인 경우만 입력으로 주어집니다

    public static void main(String[] args) {
        int arr[] = {1,3,4,5,2,3};
        programmersQuiz3 pro = new programmersQuiz3();
        pro.solution(arr);
    }

    public double solution(int[] numbers) {
            double answer = 0;
            for (int i = 0; i < numbers.length; i++)
            {
                answer += numbers[i];
            }
            return answer / numbers.length;

    }
}
