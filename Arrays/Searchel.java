import java.util.Scanner;
public class Searchel {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int ramsize= sc.nextInt();
        int ramarr []=new int[ramsize];

        for(int i =0; i<ramsize; i++)
        {
            ramarr[i]=sc.nextInt();
        }
        System.out.println("Enter element");
        int ramel= sc.nextInt();

        for(int i =0; i<ramsize; i++)
        {
         if(ramarr[i]==ramel)
            {
             System.out.println("matched element"+i);   
            } 
        else 
            {
             System.out.println("no matched element");  
            }  
        }
    }

    
}
