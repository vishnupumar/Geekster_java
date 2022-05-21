public class Main {

    
    public static int[] Array1(int[] arr){
        int n = arr.length;
        System.out.print("Even Alternate elements : ");
        for(int i=0;i<n;i++){
            if(i%2 == 0){
                System.out.print(arr[i]);
            }
        }
        
        return arr;
    }
       
    public static int[] Array2(int[] arr){
        int n = arr.length;
        System.out.print("Odd Alternate elements : ");
        for(int i=0;i<n;i++){
            if(i%2 == 1){
                System.out.print(arr[i]);
            }
        }
        return arr;
    }

    public static int[] Array3(int[] arr){
        int n = arr.length;
        System.out.print("Even Alternate elements in Reverse : ");
        for(int i=n-1;i>=0;i--){
            if(i%2 == 0){
                System.out.print(arr[i]);
            }
        }
        return arr;
    }

    public static int[] Array4(int[] arr){
        int n = arr.length;
        System.out.print("Odd Alternate elements in Reverse : ");
        for(int i=n-1;i>=0;i--){
            if(i%2 == 1){
                System.out.print(arr[i]);
            }
        }
        return arr;
    }

    public static int[] Array5(int[] arr){
        int n = arr.length;
        int Sum = 0;
        System.out.print("Sum of array : ");

        for(int i=0;i<n;i++){
            Sum = Sum + arr[i];
        }

        System.out.println(Sum);
        
        return arr;
    }


    
    public static void main(String[] args) {
        Main obj1 = new Main();
        
        int[] arr = {1,2,3,4,5,6};
        

        
        obj1.Array1(arr);
        System.out.println("\n");
        obj1.Array2(arr);
        System.out.println("\n");
        obj1.Array3(arr);
        System.out.println("\n");
        obj1.Array4(arr);
        System.out.println("\n");
        obj1.Array5(arr);
        System.out.println("\n");
    }
    
}
