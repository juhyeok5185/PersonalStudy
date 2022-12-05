public class forExam8 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
        int temp;
        temp = nums[0];
        nums[0] = nums[3];
        nums[3] = temp;

        for (int i = 0; i < 7; i++) {
            System.out.printf("%d", nums[i]);
        }

    }
}
