public class forExam5 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
//        for(int i=0; i<7; i++)
//        {
//            System.out.printf("%d",nums[i]);
//        }
        // nums[7] = 8; 배열은 정적인 값이여서 처음에 만든 크기에서 키울수없다. 배열의 값을 옮겨줘야한다.
        int[] temp = new int[10];
        for (int i=0; i<7; i++){
            temp[i] =nums[i];
        }
        nums = temp;
        nums[7] = 8;
        for (int i=0; i<8; i++){
            System.out.printf("%d",nums[i]);
        }
    }
}
