public class task9 {

    public static void main(String[] args){
        int[] a= {1,3,4,5};
        int[] b= {2,1,3,4,5};
        int[] c={1,1,1};
        System.out.println("test 1" + unlucky1(a));
        System.out.println("test 2" + unlucky1(b));
        System.out.println("test 3" + unlucky1(c));
    }

    public static boolean unlucky1(int[] nums){

        if (nums.length <2){
            return false;
        }
        if ((nums[0] == 1 && nums[1] == 3) || (nums[1] == 1 && nums[2] == 3)) {

            return true;
        }

        if (nums[nums.length -2]==1  && nums[nums.length-1]==3){

            return true;
        }

        return false;

    }
}
