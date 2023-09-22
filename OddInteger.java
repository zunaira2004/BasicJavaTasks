import java.util.Scanner;

public class OddInteger {
    public static void main(String[] args)
    {
        int size=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size o array:");
        size=s.nextInt();
        int[] array=new int[size];
        System.out.println("Enter the elements of array");
        for(int i=0;i<size;i++)
        {
            array[i]=s.nextInt();
        }
        int sum=0;
        for(int i=0;i<size;i++)
        {
            if(array[i]%2!=0)
            {
                sum=sum+array[i];
            }
        }
        System.out.println(sum +" is the sum of odd integers");

    }
}
