import java.lang.*;
import java.util.*;

public class Main {
    
    static void stringBubbleSort(String str){
        char arr[] = str.toCharArray();
        int n = arr.length;
         for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1;j++){
                if(arr[j]>arr[j+1]){
                    char temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
         }
        System.out.print(new String(arr));
    }
       static void stringSelectionSort(String str){
        char arr[] = str.toCharArray();
        int n = arr.length;
         for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    char temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
         }
        System.out.print(new String(arr));
    }
    
     static void sortString(String str){
      
        char newName[] = str.toCharArray();
         Arrays.sort(newName);
        System.out.print(new String(newName));
    }
    
    static void makeIdeal(String str){
        int n = str.length();
        String newName = "";
        
        for(int i=0;i<n;i++){
            if(i==0){
                 newName = newName + Character.toUpperCase(str.charAt(i));
            }else{
                 newName = newName + Character.toLowerCase(str.charAt(i));
            }
        }
        System.out.print(newName);
      
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str1 = "TRY tO say positive THINgs ONly";
        String word[] = str1.split(" ");
       System.out.println("--------------");
        for(int i=0;i<word.length;i++){
            if(i != word.length-1){
                makeIdeal(word[i]+" ");
            }else{
                makeIdeal(word[i]);
            }
        }
        System.out.println("\n--------------");
        stringBubbleSort(str);
     System.out.println("\n--------------");
        stringSelectionSort(str);
        System.out.println("\n--------------");
        makeIdeal(str);
        System.out.println("\n--------------");
        sortString(str);
        System.out.println("\n--------------");
        
    }
}
