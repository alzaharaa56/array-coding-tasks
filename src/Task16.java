public class Task16 {
    public static void main(String[] args) {

int[] a = {1, 2, 3};
int[] b = {1, 5, 3};
int[] c = {5, 2, 3};

System.out.println("Max [1, 2, 3]: " + maxTriple(a));
System.out.println("Max [1, 5, 3]: " + maxTriple(b));
System.out.println("Max [5, 2, 3]: " + maxTriple(c));
}

public static int maxTriple(int[] nums) {

int first = nums[0];
int middle = nums[nums.length / 2];
int last = nums[nums.length - 1];



int max = first;

if (middle > max) {
max = middle;
}

if (last > max) {
max = last;
}

return max;
}

}

