import java.util.Scanner;

public class Minnum
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size");
        int ramsize=sc.nextInt();
        int [] ramarr = new int[ramsize];
        

        for(int i=0; i<ramsize; i++)
        {
            ramarr[i]=sc.nextInt(); 
        }
        int  min = ramarr[0];

        for(int i=0; i<ramsize; i++)
        {
            if(ramarr[i]<min)
            {
                min = ramarr[i];
            }
        }
        System.out.println("Minimum number = " + min);
    }
}