import java.util.Scanner;
class Main{
  public static int great(int n1,int n2)
  {
    if(n1>n2)
      return n1;
    else 
      return n2;
  }
  
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner(System.in);
      int num1 = sc.nextInt();
      int num2 = sc.nextInt();
      int num3 = sc.nextInt();
      int res = great(num1,num2);
      if(res>num3)
        System.out.println(res);
      else
        System.out.println(num3);
      
	}
}