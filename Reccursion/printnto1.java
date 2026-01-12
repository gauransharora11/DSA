import java.util.Scanner;
public class printnto1 
{
    static void pnum(int n)
    {
     if (n==0)
        {
            return;
        }   
        pnum(n-1);
        System.out.println(n);
    }
    public static void main(String[] args)
    {
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter a");
    int a=sc.nextInt();
    pnum(a);
    }

}

