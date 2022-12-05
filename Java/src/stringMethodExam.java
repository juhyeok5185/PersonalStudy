public class stringMethodExam {
    public static void main(String[] args) {
        String str = "hello";
        int test = 1;
        System.out.println(str.length()); ; //문자의 갯수(공백도 하나의 문자로 생각함)
        System.out.println(str.concat(" world")); // 문자를 붙여줌
        System.out.println(str.substring(3)); //4번째 글자부터 마지막까지만 나옴
        System.out.println(str.substring(3,6)); //4번째 글자부터 6번째 글자까지 나타낸다.
    }
}
