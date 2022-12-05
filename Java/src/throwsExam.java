public class throwsExam {
    public static void main(String[] args) {
    int i = 10;
    int j = 0;
    try {
        int k = divide(i, j);
        System.out.println(k);
    }catch (IllegalArgumentException e){
        System.out.println(e.toString());
        }
    }
    public static int divide(int i , int j) throws IllegalArgumentException{
        //오류를 호출한 쪽에서 처리하도록 떠넘기기
        if( j==0 ){
//            System.out.println("2번째 매개변수는 0이면 안됩니다");
//            return 0;
            throw new IllegalArgumentException("0으로 나눌수 없습니다.");
            //오류를 만들었다
        }
        int k = i/j;
        return k;
    }
}
