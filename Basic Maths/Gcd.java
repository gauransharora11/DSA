import java.util.Scanner;
import java.util.ArrayList;

public class gcd 
{
    public static void main(String[] args) 
    {
       int a,b,num,num1,num2,g=1;
       ArrayList<Integer> lista = new ArrayList<>();
       ArrayList<Integer> listb = new ArrayList<>();
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a");
       a=sc.nextInt();
        System.out.println("Enter b");
       b=sc.nextInt();
       num=0;
       for(int i=1;i<=a;i++)
       {
        if (a%i==0){
            System.out.println(i);
            lista.add(i);
            // int y = lista.get(i+1);
        }
        
        } 
           // index 0 ka element

        System.out.println(lista); 
        for(int j=1;j<=b;j++)
       {
        if (b%j==0){
            System.out.println(j);
            listb.add(j);
            // int x = listb.get(j+1);
            
        }
    
        }
                System.out.println(listb);
                   // index 0 ka element


        // if(num1==num2){
        //     System.out.println("GCD is"+num1);
        // }
        // else{
        //     System.out.println("No GCD");
        // }
    for (int x : lista) {
            if (listb.contains(x)) {
                g = x;
            }
        }

        System.out.println("Divisors of a: " + lista);
        System.out.println("Divisors of b: " + listb);
        System.out.println("GCD is: " + g);
    }   
    
    
}
