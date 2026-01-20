import java.util.Scanner;
public class arrays 
{
    public static void main(String[] args)
    {
        int[] arr = new int[100];

        int size;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter size");
        size=sc.nextInt();
        for(int i=0;i<size;i++)
        {
            // ram ram
            arr[i] = sc.nextInt();        
        }
        for(int i=0;i<size;i++)
        {
        System.out.print(arr[i]);
        }

    }    
}
