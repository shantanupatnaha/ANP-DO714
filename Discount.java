import java.util.Scanner;
public class Discount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int []arr = new int[5];
		System.out.println("Enter the amount : ");
		for(int i=0;i<arr.length;i++) {
			arr[i] =sc.nextInt();
		}
		System.out.println("Your amouunt array is : ");
		for(int a : arr) {
//			System.out.println(a+"\t");
			if(a>=1000 && a<2000)
				System.out.println("You will get 10% Discount");
			else if(a>=2000 && a<3000) {
				System.out.println("You will get 20% Discount");
			}
			else if(a>=3000 && a<4000) {
				System.out.println("You will get 30% Discount");
			}
			else if(a>=4000) {
				System.out.println("You will get 40% Discount");
			}
			else {
				System.out.println("You will not get any Discount");
			}
		}
	}

}