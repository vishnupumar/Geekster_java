// "static void main" must be defined in a public class.
public class oddFirstEvenLast {
    
    static void oddFirstEvenLast1(int[] arr){
           int n = arr.length;
        
        int i=0;
        int j=n-1;
        
        while(i<j){
            if(arr[i]%2 == 0 && arr[j]%2 == 1){
               int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
            if(arr[i]%2 == 1){
                i++;
            }else{
                j--;
            }
            
        }
        for(i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {5,3,2,3,7,5,3,1,4};
        
       oddFirstEvenLast1(arr);
        
    }
}