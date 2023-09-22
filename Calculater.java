import java.util.Scanner;

public class Calculater {

    public static void main(String[] args)
    {
        int num1=0, num2=0;
        System.out.println("Enter two numbers to perform operations");
        Scanner s =new Scanner(System.in);
        num1=s.nextInt();
        num2=s.nextInt();
        System.out.println("Enter the operation you want to perform \n The choices are: + , - , * , /");
        char c;
        c=s.next().charAt(0);
        if(c=='+')
            System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
        else if(c=='-')
            System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
        else if(c=='*')
            System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
        else if(c=='/')
        {
            if(num2==0)
                System.out.println("Denominator cannot be zero!");
            else
            System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
        }
    }
}
