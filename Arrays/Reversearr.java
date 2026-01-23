import java.util.Scanner;
public class Reversearr {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter Size");
        int ramsize = sc.nextInt();
        int [] ramarr=new int[ramsize];
        for (int i = 0; i<ramsize; i++)
        {
        System.out.println("number"); 
        ramarr[i] = sc.nextInt();  
        }

        for(int i = ramarr.length - 1; i >= 0; i--)
        {
         System.out.println(ramarr[i]);   
        }       
    }
}
