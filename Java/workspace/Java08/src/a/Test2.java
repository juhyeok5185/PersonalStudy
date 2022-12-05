package a;

public class Test2 extends Test {
    public static void main(String[] args) {
        Test test = new Test(); // 같은 폴더안에 있는 스크립트를 불러온다.
        System.out.println(test.a); // test안에 있는 a라는 변수를 불러들인다.
        System.out.println(test.c);
    }
}
