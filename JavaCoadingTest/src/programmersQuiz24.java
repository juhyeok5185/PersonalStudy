import java.util.Arrays;

public class programmersQuiz24 {
//    두 배열이 얼마나 유사한지 확인해보려고 합니다.
//    문자열 배열 s1과 s2가 주어질 때 같은 원소의
//    개수를 return하도록 solution 함수를 완성해주세요.
    public static void main(String[] args) {
        String[] str1 = {"a","b","c","d","e","f","g"};
        String[] str2 = {"c","d","e","f","g"};
        programmersQuiz24 pro = new programmersQuiz24();
        pro.solution(str1 , str2);
    }
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        for (int i = 0; i < s1.length; i++){
            for (int j = 0; j < s2.length; j++){
                if (s1[i].equals(s2[j])){
                    answer++;
                }
            }
        }
        return answer;
    }

}
