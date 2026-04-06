public class Task5 {
    public static void main(String[] args) {
        int[] nums1 = {4, 5};
        int[] nums2 = {4, 2};
        System.out.println("Test 1" + no23(nums1));
        System.out.println("Test 2" + no23(nums2));
    }

    public static boolean no23(int[] nums) {

        boolean a2 = (nums[0] == 2 || nums[1] == 2);
        boolean b3 = (nums[0] == 3 || nums[1] == 3);

        return !a2 && !b3;

    }
}
