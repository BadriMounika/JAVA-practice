package conditionsandloops;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter n value:");
        int n = sc.nextInt();
        
        int a = 0, b = 1;
        
        // Handle cases for n = 1 or n = 2
        if (n >= 1) {
            System.out.println(a);
        }
        if (n >= 2) {
            System.out.println(b);
        }
        
        // Print the rest of the Fibonacci sequence
        for (int i = 2; i < n; i++) {
            int c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }
        
        sc.close();
    }
}
