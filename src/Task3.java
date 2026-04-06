public class Task3 {

    public static void main (String[] args) {

        int[] nums = {1, 2, 3};
        int[] result = reverse3(nums);

        System.out.print("Reverse of [1,2,3] is:");
        System.out.print(result[0] + "" + result[1] + " " + result[2]);
    }

       public static int[] reverse3 (int[] nums){

           int[] reversed= new int [3];
           reversed[0] = nums[2];
           reversed[1] = nums[1];
           reversed[2] = nums[0];
           return reversed;

        }

    }

