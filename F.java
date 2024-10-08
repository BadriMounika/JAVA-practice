package firstjava;
import java.util.*;
public class F {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the limit for the Fibonacci series: ");
        int limit = scanner.nextInt();
        int first = 0, second = 1;
        System.out.println("Fibonacci Series up to " + limit + ":");
        while (first <= limit) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
        scanner.close();
    }
}


    

