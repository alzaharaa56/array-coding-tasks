public class task14 {
    public static void main(String[] args) {

int[] a1 = {1, 2, 3};
int[] b1 = {1, 3};

int[] a2 = {7, 2, 3};
int[] b2 = {1};



System.out.println("Result 1: " + start1(a1, b1));
System.out.println("Result 2: " + start1(a2, b2));
}

public static int start1(int[] a, int[] b) {
int count = 0;



if (a.length > 0 && a[0] == 1) {
count++;
}



if (b.length > 0 && b[0] == 1) {
count++;
}

return count;
}

}

