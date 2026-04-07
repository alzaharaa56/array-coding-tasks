public class Task15 {
    public static void main(String[] args) {

        int[] a = {1, 2};
        int[] b = {3, 4};

        int[] result = plusTwo(a, b);


        System.out.print("Result: [");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) {
                System.out.print(" ");
            }
        }
    }

public static int[] plusTwo(int[] a, int[] b) {

int[] combined = new int[4];



combined[0] = a[0];
combined[1] = a[1];



combined[2] = b[0];
combined[3] = b[1];

return combined;
}

}

