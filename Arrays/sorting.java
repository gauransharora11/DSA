import java.util.Arrays;
import java.util.Scanner;
public class sorting {
    public static void main (String[] arrays)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int ramsize= sc.nextInt();
        int  ramarr [] =new int[ramsize];

        for(int i=0 ; i<ramsize ; i++)
        {
            System.out.println("Enter number");
            ramarr[i] = sc.nextInt();
        }
        Arrays.sort(ramarr);
        for(int i=0 ; i<ramarr.length ; i++)
        {
            System.out.println(ramarr[i]);
        }
    }

    
}
