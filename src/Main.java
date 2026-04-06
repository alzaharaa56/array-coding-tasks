//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] myNumbers = {1, 2, 6};
        System.out.println((firstLast6(myNumbers)));
    }

        public static boolean firstLast6(int[]nums) {

            int first = nums[0];
            int last = nums [nums.length -1];

            boolean isSix = (first == 6 || last ==6);
            return isSix;
        }

    }

