import java.util.Scanner;
public class Sumarr {
     static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter size");
        int ramsize = sc.nextInt();
        int ramarr [] = new int[ramsize];   
        
        
        for(int i =0; i<ramsize; i++)
        {
        ramarr [i]  = sc.nextInt();  
        }
        int sum = 0;
        for(int i =0; i<ramsize; i++)
        {
          sum=sum+ramarr[i] ;
        }
        System.out.println("Sum = " + sum);
    }
}
