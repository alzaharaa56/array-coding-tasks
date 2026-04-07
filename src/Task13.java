public class Task13 {

    public static void main(String[] args) {

        int[] nums = {4, 5, 6};


        int[] result = makeLast(nums);


        System.out.print("Result");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);}
            if (i < result.length - 1) {


            }
        }

        public static int[] makeLast ( int[] nums){

            int[] newArray = new int[nums.length * 2];


            int lastValue = nums[nums.length - 1];


            newArray[newArray.length - 1] = lastValue;


            return newArray;
        }
    }


