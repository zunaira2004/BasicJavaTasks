import java.util.Scanner;

public class Temprature {
    public static void main(String[] args)
    {
        float far;
        Scanner s =new Scanner(System.in);
        System.out.println("Enter temperature in farhenhite:");
        far=s.nextFloat();
        far=5*(far-32);
        far=far/9;
        System.out.println(far+ "is the temperature in celsius");
    }
}
