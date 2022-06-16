public class Main {
    
     static boolean checkPangram(String str1){
        int n1 = str1.length();
        int[] arr = new int[26];
         
          for(int i=0;i<n1;i++){
            int ind = str1.charAt(i)-97;
            arr[ind] = arr[ind] + 1;
        }
         for(int i=0;i<arr.length;i++){
             if(arr[i] == 0){
                 return false;
             }
         }
         return true;
    }
  
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
   
        System.out.print(checkPangram(str1));
        
    }
}
