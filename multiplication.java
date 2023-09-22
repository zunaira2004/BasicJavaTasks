import java.util.Scanner;
public class multiplication {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int num=0;
        System.out.println("Input a number:");
        num=s.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(num+" x " + i + " = "+num*i);
        }

    }
}
