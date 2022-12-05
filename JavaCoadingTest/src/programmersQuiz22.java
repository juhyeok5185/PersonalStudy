public class programmersQuiz22 {
//    문자열 my_string과 문자 letter이 매개변수로 주어집니다.
//    my_string에서 letter를 제거한 문자열을 return하도록
//    solution 함수를 완성해주세요.
    public static void main(String[] args) {
        programmersQuiz22 pro = new programmersQuiz22();
        pro.solution("박","안박녕박하박세박요끼유");
    }
    public String solution(String my_string, String letter) {
        return my_string.replaceAll(letter, "");
    }
}
