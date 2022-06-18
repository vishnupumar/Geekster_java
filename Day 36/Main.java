// "static void main" must be defined in a public class.
public class Main {
    static char lastNonRepeating(String str){
        int n = str.length();
        int[] count = new int[26];
        str = str.toLowerCase();
        
        for(int i=0;i<n;i++){
            int ind = str.charAt(i) - 97;
            count[ind] += 1;
        }
        for(int i=n-1;i>=0;i--){
            int ind = str.charAt(i) - 97;
            if(count[ind] == 1){
                return str.charAt(i);
            }
        }
        return '-';
    }
    
    static char firstRepeating(String str){
        int n = str.length();
        int[] count = new int[26];
        str = str.toLowerCase();
        
        for(int i=0;i<n;i++){
            int ind = str.charAt(i) - 97;
            count[ind] += 1;
        }
        for(int i=0;i<n;i++){
            int ind = str.charAt(i) - 97;
            if(count[ind] > 1){
                return str.charAt(i);
            }
        }
        return '-';
    }
    
     static char lastRepeating(String str){
        int n = str.length();
        int[] count = new int[26];
         str = str.toLowerCase();
        
        for(int i=0;i<n;i++){
            int ind = str.charAt(i) - 97;
            count[ind] += 1;
        }
        for(int i=n-1;i>=0;i--){
            int ind = str.charAt(i) - 97;
            if(count[ind] > 1){
                return str.charAt(i);
            }
        }
        return '-';
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        System.out.println("Last Non Repeating Character : "+lastNonRepeating(str));
        System.out.println("First Repeating Character : "+firstRepeating(str));
        System.out.println("Last Repeating Character : "+lastRepeating(str));
    }
}
