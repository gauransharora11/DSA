import java.util.Scanner;
public class Minnum {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Size");
        int ramsize= sc.nextInt();
        int ramarr[]=new int[ramsize];

        for(int i=0; i<ramsize;i++)
        {
        System.out.println("number"); 
        ramarr[i] = sc.nextInt(); 
        }
        int min = ramarr[0];
        for(int i=1; i<ramarr.length;i++)
        {
        if (ramarr[i]< min)
        {
         min=ramarr[i]   ;
        }
        System.out.println("Min = " + min);
        }
        

    }
    
}
