public class trycatchExam {
    public static void main(String[] args) {
        int intArray[] = new int[5]; // intArray라는 변수에다가 5의 공간만큼을 배열로 선언. (0,1,2,3,4,5)
        try //try안에 구문을 실행하다 에러가 발생하면 catch를 발생해줘
        {
            intArray[3] = 10;
            intArray[6] = 1;
        }
        catch (Exception e) //e에 에러의 원인을 담아뒀다.
        {
            e.printStackTrace(); //에러의 위치를 콘솔로 나타낸다.
            System.out.println("배열범위초과");
            System.exit(0); //프로그램을 종료시켜버린다.
        }
        System.out.println("프로그램이 끝났어요");
    }
}
