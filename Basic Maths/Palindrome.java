import java.util.Scanner;
public class palindrome 
{
    public static void main(String[] args) {
        int a,b,revnum,num;
        revnum=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a");
        a=sc.nextInt();
        num=a;
        while (a>0)
        {
            b=a%10;
            revnum=revnum*10+b;
            a=a/10;
            
        }
        System.out.println("Reverse"+revnum);
        if(revnum == num)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("No Palindrome");
        }
    }
}
