public class forExam6 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3};
        int[] nums2 = {4,5,6};
        int[] nums = new int[6];

        for(int i=0; i<3; i++){
            nums[i] = nums1[i];
            nums[i+3] = nums2[i]; //nums의 4번째 자리에 넣기 위해 +3을 해준다.
        }
        System.out.printf("%d",nums.length);
    }
}
