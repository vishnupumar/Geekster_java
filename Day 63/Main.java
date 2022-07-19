// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        int[] arr = {5,4,-9,3,-1,2,-20,7,-6,8};
        int n = arr.length;

        int j=n-1;
        for(int i=n-1;i>=0;i--){
            if(arr[i] <0){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                j--;
            }
        }
       
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
