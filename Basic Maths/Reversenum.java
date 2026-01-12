import java.util.Scanner;
public class Reversenum 
{
    public static void main(String[] args) {
        int a,b,revnum;
        revnum=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a");
        a=sc.nextInt();
        while (a>0)
        {
            b=a%10;
            revnum=revnum*10+b;
            a=a/10;
            
        }
        System.out.println("Reverse"+revnum);
    }
}
