public class programmersQuiz6 {

//    정수가 담긴 배열 array와 정수 n이 매개변수로 주어질 때,
//    array에 n이 몇 개 있는 지를 return 하도록 solution
//    함수를 완성해보세요.

//            1 ≤ array의 길이 ≤ 100
//            0 ≤ array의 원소 ≤ 1,000
//            0 ≤ n ≤ 1,000
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,2,3,24,1,23,54,2,1,23,1,3};
        programmersQuiz6 pro = new programmersQuiz6();
        pro.solution(arr,2);
    }
    public int solution ( int[] array, int n){
        int answer = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] == n){
                answer ++;
            }
        }
        return answer;
    }
}
