public class task26 {
    public static int[] front11(int[] arr1,int[] arr2){
        int[] result=new int[2];
        if(arr1.length==0){
            result[0]=arr2[0];
        }else if(arr2.length==0) {
            result[0] = arr1[0];
        }else{
            result[0]=arr1[0];
            result[1]=arr2[0];
        }
        return result;
    }
}

