import java.util.Scanner;
public class Countdigits 
{
    public static void main(String[] args) {
        int a,b,count;
        count=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a");
        a=sc.nextInt();
        while (a>0)
        {
            a=a/10;
            count++;
        }
        System.out.println("Count"+count);
    }
}
