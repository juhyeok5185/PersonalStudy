public class filedExam {
    public static void main(String[] args) {
        car c1 = new car();
        car c2 = new car();

        c1.name = "소방차";
        c1.number = 1234;

        c2.name = "구급차";
        c2.number = 1111;

        System.out.println(c1.name);
        System.out.println(c1.number);
        System.out.println(c2.name);
        System.out.println(c2.number);
    }
}
