public class Main {

    static void countDuplicates(int[] arr){
        int n = arr.length;
        
        int count=0;
        for(int i=0;i<n-1;i++){
            if(arr[i] == arr[i+1]){
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        int[] arr = {2,2,4,4,5,6,6,7};

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        countDuplicates(arr);
        
    }
    
}
