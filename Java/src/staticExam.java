public class staticExam {
        int normalValue = 10;
        static int staticValue = 10;

    public void test1 () {
        //System.out.println(normalValue); static이 아니라 사용 불가능
        System.out.println(staticValue);
    }

    public static void main(String[] args) {
        //System.out.println(normalValue); static이 아니라 사용 불가능
        System.out.println(staticValue);

        staticExam s1 = new staticExam();
        System.out.println(s1.normalValue);

    }
}
