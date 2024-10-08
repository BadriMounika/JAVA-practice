package firstjava;
import java.util.*;
public class G {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check if it is a palindrome: ");
        String s= scanner.nextLine();
        if (isPalindrome(s)) {
            System.out.println("\"" + s + "\" is a palindrome.");
        } else {
            System.out.println("\"" + s + "\" is not a palindrome.");
        }
        scanner.close();
    }
    public static boolean isPalindrome(String str) {
        str = str.replaceAll("\\s+", "").toLowerCase();
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
}

    

