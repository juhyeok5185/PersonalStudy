import java.sql.SQLOutput;

public class MethodExam {
    public static void main(String[] args) {
//        String a = "Hello";
//        String b = "Danny";
//        System.out.println(a+b);

        MethodExam methodExam = new MethodExam(); // 클래스 생성
        methodExam.StrCombine("hello" , "danny"); // 메소드 실행 (String 타입을 2개를 넘겨줌)
        System.out.println(methodExam.StrDanny("hello" , "Danny"));

    }
    //Method를 이용하여 표현
    //매소드를 만드는 이유
    //1.유지보수
    //2.가독성
    //3.캡슐화(여러 곳에서 중복된 코드를 작성할 필요가 없어짐)
    public void StrCombine(String a, String b){ //void는 실행형 메소드
        String result = a+b;
        System.out.println(result);
    }
    public String StrDanny (String a, String b) { //리턴형 메소드
        String result = a+b;
        return result; // 되돌려준다.
    }
}
