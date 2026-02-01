import java.util.Scanner;
public class Maxnum
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size");
    int ramsize = sc.nextInt();
    int ramarr [] = new int[ramsize];

    for(int i=0; i<ramsize; i++)
    {
      ramarr[i]=sc.nextInt();
    }
     int max = ramarr[0];

     for(int i=0; i<ramsize; i++)
     {
      if(ramarr[i] > max)
      {
       max=ramarr[i] ;
      }
     }
     System.out.println("MAX"+max);
  }
}