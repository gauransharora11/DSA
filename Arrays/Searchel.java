import java.util.Scanner;
public class Searchel {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size");
        int ramsize= sc.nextInt();
        int [] ramarr=new int[ramsize];

        System.out.println("Enter element");
        int element= sc.nextInt();

        for(int i=0; i<ramsize; i++)
        {
         System.out.println("Enter number");
        ramarr[i]= sc.nextInt();   
        }
        boolean found = false;
        for(int i=0; i<ramarr.length; i++)
        {
         if(ramarr[i]==element)
            {
             System.out.println("Element found Index"+i);
             found = true;
                break;   
            } 
        }
        if(!found)
        {
            System.out.println("Element not found");
        }
        
    }

    
}
