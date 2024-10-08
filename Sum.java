package conditionsandloops;
import java.util.Scanner;
public class Sum {
    


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sumNegative = 0;
        int sumEvenPositive = 0;
        int sumOddPositive = 0;
        int number;

        System.out.println("Enter numbers (enter 0 to finish):");

        // Loop to read numbers until the user enters 0
        while (true) {
            number = sc.nextInt();
            
            if (number == 0) {
                break; // Exit the loop if the user enters 0
            }
            
            // Classify the number and update the corresponding sum
            if (number < 0) {
                sumNegative += number;
            } else if (number > 0) {
                if (number % 2 == 0) {
                    sumEvenPositive += number;
                } else {
                    sumOddPositive += number;
                }
            }
        }

        // Print the results
        System.out.println("Sum of negative numbers: " + sumNegative);
        System.out.println("Sum of positive even numbers: " + sumEvenPositive);
        System.out.println("Sum of positive odd numbers: " + sumOddPositive);
        
        sc.close(); // Close the Scanner
    }
}


