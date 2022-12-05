public class forExam7 {
    public static void main(String[] args) {
        int[] nums = {5,2,7,4,6,1,3};
        int index = -1;
//        if(nums[0] == 1){
//            index = 0;
//        }

        for (int i=0; i<7; i++){
            if(nums[i] == 1){
                index = i;
                break; //반복문을 끝내준다.
            }
        }

        System.out.printf("%d",index);
    }
}
