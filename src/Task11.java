public class Task11 {
    public static void main(String[] args) {

  int[] test1 = {1, 2, 3};
  int[] test2 = {11, 5, 9};

  int[] result = maxEnd3(test1);



    System.out.print("Result");
     for (int i = 0; i < result.length; i++) {
         System.out.print(result[i] + (i < result.length - 1 ? ", " : ""));
}

}

public static int[] maxEnd3(int[] nums) {

    int max;
    if (nums[0] > nums[2]) {
     max = nums[0];
     } else {
   max = nums[2];
}



nums[0] = max;
nums[1] = max;
nums[2] = max;

return  nums;
}
}

