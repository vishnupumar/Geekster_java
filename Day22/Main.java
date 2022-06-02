// "static void main" must be defined in a public class.
public class Main {
    
    static void twoSum(int[] arr,int x){
        int n = arr.length;
        int target = x;
        int count =0;
        int i=0;
        int j=n-1;
        
        while(i<j){
            int sum = arr[i] + arr[j];
            if(sum == target){
                count++;
                j--;
                i++;
            }else if(sum < target){
                i++;
            }else{
                j--;
            }
        }
        System.out.print(count);
          
    }
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,6,7,8,9};
        int x = 9;
        
       twoSum(arr,x);
        
    }
}