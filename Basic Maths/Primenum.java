import java.util.Scanner;
public class Primenum {
    public static void main(String[] args) {
       int a,b,num;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a");
       a=sc.nextInt();
       num=0;
       for(int i=1;i<=a;i++)
       {
        if (a%i==0){
            System.out.println(i);
            num++;
        }
        // System.out.println(num);
    }  
    if(num==2)
        {
         System.out.println("prime");   
        }
        else
        {
            System.out.println("not prime");
        }
       
       
    }
}
