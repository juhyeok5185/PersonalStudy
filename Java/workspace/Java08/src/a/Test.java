package a;

//default, public, private, protected 를 나눈 이유는 보안 강화를위해

public class Test { //클래스는 첫글자를 대문자로 나타내는게 관례
    public String a = "전부 사용 가능"; //public으로 선언시 같은 프로젝트안에서 전부 공유가 가능하다.

    private String b = "접근금지"; //이 스크립트안에서만 가능하나.

    protected String c = "거의 디폴트와 같음"; //같은 패키지(폴더) 안에서 공유가 가능하고 다른 패키지도 extends를 통해 공유가능
    public static void main(String[] args) {

    }
}
