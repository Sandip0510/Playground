import java.util.Scanner;
public class Main{
  public static int gcd(int m,int n)
{
        int rem;
        while(n!=0)
        {
                rem=m%n;
                m=n;
                n=rem;
        }
        return(m);
}
 
	public static void main (String[] args)
	{
	    // Type your code here
      Scanner sc = new Scanner(System.in);
      int num1 = sc.nextInt();
      int num2 = sc.nextInt();
      int num3 = sc.nextInt();
      int gcd1;int gcd2;
      if(num1==0 && num2==0 && num3==0)
        {
                System.out.println("\nInvalid number");
                
        }
       gcd1=gcd(num1,num2);
        gcd2=gcd(num3,gcd1);
      System.out.println(gcd2);
	}
}