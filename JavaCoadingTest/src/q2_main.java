public class q2_main {
    public static void main(String[] args) {
        int[] array = new int[100];
        array[1] = 1;
        array[2] = 1;

        for (int i = 3; i < 100; i++){
            array[i] = array[i-1] + array[i-2];
        }
        for (int i=1; i<10; i++){
            System.out.print(array[i]+" ");
        }

        //2번째 방법

        int prevPrevNum = 1;
        int prevNum = 1;

        System.out.println(prevNum + "" );
        System.out.println(prevPrevNum + " ");
        for (int i=3; i<10; i++){
            int nNum = prevPrevNum + prevNum;
            System.out.println(nNum + "");

            prevNum = nNum;
            prevPrevNum = prevNum;
        }
            }
}
