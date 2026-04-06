public class task12 {
    public static void main(String[] args) {


int[] nums = {1, 2, 3};



int[] result = makeEnds(nums);


            System.out.print("Result: [");
            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i]);
                if (i < result.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }

        public static int[] makeEnds ( int[] nums){

            int[] res = new int[2];


            res[0] = nums[0];


            res[1] = nums[nums.length - 1];


            return res;
        }

    }

