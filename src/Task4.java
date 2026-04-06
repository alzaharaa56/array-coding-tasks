public class Task4 {

    public static void main (String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};
        int[] result = middleWay(a, b);

        System.out.println("Middle elements " + result[0] + " ," + result[1]);
    }

        public static int[] middleWay (int[] a, int[] b){

          int[] result = new int[2];

          result[0] = a[1];
          result[1] = b[1];
          return result;





        }





    }

