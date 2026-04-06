public class task10 {

    public static void main (String[] args){
        int[] a= {1,2,3};
        int[] b= {1,2,3,1};
        int[] c = {1,2,1};
        System.out.println("test a"+ sameFirstLast(a));
        System.out.println("test b"+ sameFirstLast(b));
        System.out.println("test c"+ sameFirstLast(c));

    }
    public static boolean sameFirstLast(int[] nums){

        if (nums.length >= 1 && nums[0] == nums[nums.length -1]){

            return true;
        }
        return false;

    }

}
