import java.lang.Math;
import java.util.Scanner;
class Main
{
  public static double power(int b,int e)
  {
    double res = Math.pow(b,e);
    return res;
  }
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    int n2 = sc.nextInt();
    double r = power(n1,n2);
    System.out.println(r);
  }
}
      
