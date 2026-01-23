import java.util.Scanner;
public class Maxnum {
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
    int ramsize;
    System.out.print("Enter size");
    ramsize = sc.nextInt();
    int [] ram= new int[ramsize];
    
    
    int max = ram[0];

    for (int i=0; i<ramsize; i++)
    {
       System.out.println("number"); 
        ram[i] = sc.nextInt();
    }

    for (int i=1; i<ram.length; i++) 
    {
        if(ram[i]>max)
        {
            max=ram[i];
        }
    }
    // System ram ram
    System.out.println("max"+max);
    }
}
