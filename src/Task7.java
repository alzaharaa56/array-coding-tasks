public class Task7 {
    public static void main (String[] args){

        int[] a= {2, 2};
        int[] b= {3,3};
        int[] c= {2,3};

        System.out.println("test a" + double23(a));
        System.out.println("test b" + double23(b));
        System.out.println("test c" + double23(a));




    }
    public static boolean double23(int[] nums) {

        if (nums.length == 2){

            return (nums[0] == 2 && nums[1] == 2 ) || (nums[0] ==3 && nums[1] ==3) ;
        }
        return false;







    }
}
