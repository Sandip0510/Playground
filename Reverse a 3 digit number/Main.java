import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = n/100;
    int b = n%10;
    int c = (n%100)/10;
    System.out.print(b);
    System.out.print(c);
    System.out.print(a);
  }
}