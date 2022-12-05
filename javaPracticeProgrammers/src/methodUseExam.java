public class methodUseExam {
    public static void main(String[] args) {
        methodExam methoexam = new methodExam();

        methoexam.method1();

        methoexam.method2(10);
        int value = methoexam.method3();
        System.out.println("m3" + value);

        methoexam.method4(4, 5);

        int value2 = methoexam.method5(55);
        System.out.println("m5" + value2);
    }
}
