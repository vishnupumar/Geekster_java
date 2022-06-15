// "static void main" must be defined in a public class.
public class Main {
    static String checkPalindrome(String str){
        int n = str.length();
        int i=0;
        int j=n-1;
        while(i<j){
            if(str.charAt(i) != str.charAt(j)){
                return "Not a Palindrome";
            }
            i++;
            j--;
        }
        return "Palindrome";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        System.out.print(checkPalindrome(str));
    }
}
