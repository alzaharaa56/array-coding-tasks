public class task17 {
    public static int[] make2(int[] a, int[] b) {
int[] res = new int[2];
int count = 0;



for (int i = 0; i < a.length && count < 2; i++) {
res[count] = a[i];
count++;
}



for (int i = 0; i < b.length && count < 2; i++) {
res[count] = b[i];
count++;
}

return res;
    }
}
