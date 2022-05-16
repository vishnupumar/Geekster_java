import java.util.*;

public class Day1 {

    public static int printSum(int a,int b){
        int sum = a+b;
        return sum;
    }

    public static int areaOfRectangle(int a,int b) {
        int area = a*b;
        return area;
        
    }

    public static void main(String[] args){
        Day1 d = new Day1();

        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        System.out.println("Sum " + d.printSum(a,b));

        System.out.println("Area of Rectangle " + d.areaOfRectangle(a,b));
    }
    
}
