//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] myNumbers = {1, 2, 6};

        System.out.println("Task 1:"+ firstLast6(myNumbers));

        int[] a= {1,2,3};
        int[] b= {7,3};
        System.out.println("Task 2:"+ (commonEnd(a,b)));
    }

        public static boolean firstLast6(int[]nums) {

            int first = nums[0];
            int last = nums [nums.length -1];

            boolean isSix = (first == 6 || last ==6);
            return isSix;
        }



    // Task 2: commonEnd

public static boolean commonEnd (int[] a, int[] b) {

    boolean sameFirst = (a[0] == b[0]);
    boolean sameLast = (a[a.length - 1] == b[b.length - 1]);
    return (sameFirst || sameLast);
}
}




