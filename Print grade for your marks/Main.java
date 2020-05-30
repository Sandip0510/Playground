import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner sc = new Scanner(System.in);
      int mks = sc.nextInt();
      if(mks>=85)
        System.out.println("A");
      else if(mks>=75 && mks<85)
        System.out.println("B");
      else if(mks>=65 && mks<75)
        System.out.println("C");
      else if(mks>=55 && mks<65)
        System.out.println("D");
      else if(mks>=45 && mks<55)
        System.out.println("E");
      else
        System.out.println("Fail");
      
      
    }
}