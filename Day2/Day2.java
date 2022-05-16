import java.util.*;

public class Day2 {
    
    public static int hoursFormat(int a) {
        if(a>0 && a<12){
            System.out.println("Good Morning");
        }else if(a>=12 && a<=16){
            System.out.println("Good Afternoon");
        }else if(a>16 && a<=20){
            System.out.println("Good Evening");
        }else if(a>20 && a<=24){
            System.out.println("Good Night");
        }else{
            System.out.println("Invalid input");
        }
        return a;
        
    }

    public static int reportCard(int a) {
        if(a>=0 && a<36){
            System.out.println("Fail");
        }else if(a>=36 && a<46){
            System.out.println("Passed Grade E");
        }else if(a>=46 && a<60){
            System.out.println("Passed Grade D");
        }else if(a>=60 && a<70){
            System.out.println("Passed Grade C");
        }else if(a>=70 && a<80){
            System.out.println("Passed Grade B");
        }else if(a>=80 && a<90){
            System.out.println("Passed Grade A");
        }else if(a>=90 && a<100){
            System.out.println("Passed Grade A+");
        }else if(a==100){
            System.out.println("Congratulations! Passed Grade A++");
        }else{
            System.out.println("Invalid input");
        }
        return a;
    }
    public static void main(String[] args) {
        Day2 d = new Day2();

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter 24 hours format : ");
        int n1 = sc.nextInt();
        System.out.print("Enter marks : ");
        int n2 = sc.nextInt();

        d.hoursFormat(n1);
        d.reportCard(n2);
    }
    
}
