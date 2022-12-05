public class exceptionExam {
    public static void main(String[] args) {
//        int i = 10;
//        int j = 0;
//        int k = i/j;
//        System.out.println(k); // 예외 발생 시점부터 프로그램은 종료된다. 정수를 0으로 나눌때

        int i = 10;
        int j = 0;
        try{
            int k = i/j;
            System.out.println(k);
        }catch (ArithmeticException e){
            System.out.println("0으로 나눌수 없습니다." + e.toString()); //예외의 정보를 알려줌
        }finally {
            System.out.println("오류가 발생해도 무조건 실행");
        }
    }
}
