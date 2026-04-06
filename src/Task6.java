
import java.util.Arrays;
public class Task6 {
    public static void main(String[] args) {

        int[] nums = {4, 5, 6};
        int[] result = makeLast(nums);

        System.out.print("Result" + Arrays.toString(result));
    }

    public static int[] makeLast(int[] nums) {
        int[] newArray = new int[nums.length * 2];

        for (int i = 0; i < newArray.length - 1; i++) {

            newArray[i] = 0;
            int lastElement = nums[nums.length - 1];
            newArray[newArray.length - 1] = lastElement;


        }
        return newArray;
    }
}













