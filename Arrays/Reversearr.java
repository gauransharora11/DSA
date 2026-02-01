import java.util.Scanner;
public class Reversearr {
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter size");
        int ramsize = sc.nextInt();
        int ramarr [] = new int[ramsize];

        for (int i =0; i<ramsize; i++)
        {
            ramarr[i]=sc.nextInt();
        }
        for (int  i = ramsize-1; i >=0; i--)
        {
            System.out.println(ramarr[i]); 
        }
    }
}
