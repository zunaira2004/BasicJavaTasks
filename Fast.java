public class Fast {
    public static void main(String[] args)
    {
        for(int i=0;i<10;i++)
        {
            System.out.print("*");
            if(i==0||i==5)
            {
                for(int j=0;j<10;j++)
                {
                    System.out.print("*");
                }
            }
            System.out.print("\n");
        }
        System.out.print("\n");
        for(int i=0;i<10;i++)
        {
            System.out.print("*");
            if(i==0||i==5)
            {
                for(int j=0;j<10;j++)
                {
                    System.out.print("*");
                }
            }
            else
            {
                System.out.print("         *");
            }
            System.out.print("\n");
        }
        System.out.print("\n");

        for(int i=0;i<10;i++)
        {
           if(i<=5)
           {
               System.out.print("*");
           }
            if(i==0||i==5||i==9)
            {
                for(int j=0;j<10;j++)
                {
                    System.out.print("*");
                }
            }
            if(i>5&&i!=9)
            {
                System.out.print("         *");
            }
            System.out.print("\n");
        }
        System.out.print("\n");

        for(int i=0;i<10;i++)
        {
            if(i!=0)
            System.out.print("    *");
            if(i==0)
            {
                for(int j=0;j<10;j++)
                {
                    System.out.print("*");
                }
            }
            System.out.print("\n");
        }
        System.out.print("\n");

    }
}
