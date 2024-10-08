package firstjava;
import java.util.*;



public class E {
    public static void main(String[] args) {
        // Conversion rate from INR to USD
        final double CONVERSION_RATE = 0.012;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount in Indian Rupees (INR): ");
        double inrAmount = scanner.nextDouble();
        double usdAmount = inrAmount * CONVERSION_RATE;
        System.out.printf("Equivalent amount in USD:", usdAmount);
        scanner.close();
    }
}

