import java.util.Arrays;

public class task8 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int[] result = midThree(nums);

        System.out.println("result" + Arrays.toString(result));


    }

    public static int[] midThree(int[] nums) {

        int mid = nums.length / 2;
        int[] result = new int[3];
         result[0]    = nums[mid -1];
          result[1]   =nums[mid];
          result[2] = nums[mid + 1];

            return result;
        }




    }
