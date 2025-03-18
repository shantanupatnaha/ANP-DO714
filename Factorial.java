import java.util.Scanner;

class Practice{
	public static int fac(int n)
	{
		
		if(n==0)
			return 1;
		return n * fac(n-1);
	}
}



public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to calculate factorial ");
		num = sc.nextInt();
		int result = Practice.fac(num);
		System.out.println(result);
		
		
		

	}

}
