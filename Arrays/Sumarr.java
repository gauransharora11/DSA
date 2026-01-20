import java.util.Scanner;
public class sumarr {
    public static void main(String[] args)
    {
        int[] ram = new int[100];
        int sum=0;
        int ramsize;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter size");
        ramsize = sc.nextInt();

        for (int i = 0; i<ramsize ; i++)
        {
        ram[i] = sc.nextInt();    
        }
        for (int i = 0; i<ramsize ; i++)
        {
        sum=sum+ram[i];
        }
        System.out.println("sum" +sum);        
    }
}
