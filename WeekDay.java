import java.util.Scanner;

public class WeekDay {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int num=0;
        System.out.println("Enter a number between 1 and 7");
        num=s.nextInt();
        if(num==1)
            System.out.println("Monday");
        if(num==2)
            System.out.println("Tuesday");
        if(num==3)
        System.out.println("Wednesday");
        if(num==4)
        System.out.println("Thursday");
        if(num==5)
        System.out.println("Friday");
        if(num==6)
        System.out.println("Saturday");
        if(num==7)
        System.out.println("Sunday");
    }
}
