import java.util.Scanner;
class Main
{
  public static int square(int num)
  {
    int n = num*num;
    return n;
  }
	public static void main (String[] args)
    {
	 // Type your code here   
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = square(a);
      System.out.println(b);
      
	} 
}