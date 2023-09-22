import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args)
    {
        int num=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Input an integer between 0 and 1000:");
        num=s.nextInt();

        int rem=0,sum=0;
        while(num%10!=0)
        {
            rem=num%10;
            sum=sum+rem;
            num=num/10;

        }
        System.out.println(sum);
    }
}
