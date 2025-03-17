import java.util.Scanner;

public class Fibonacci{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number ");
        int n = sc.nextInt(); 
        
        int a = 0, b = 1, count = 0;
        
        System.out.println("Fibonacci Series:");
        
        while (count < n) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
            count++;
        }
        
        
    }
}
