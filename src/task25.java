public class task25 {
    public static int[] frontPiece(int[] nums) {
if (nums.length < 2) {
return nums;
}

return new int[] {nums[0], nums[1]};
    }
}
