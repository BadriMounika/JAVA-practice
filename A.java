package firstjava;

    
import java.util.*;
    public class A{
    public static void main(String[] args) {
        String s;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the name:");
        s=sc.next();
        System.out.println("Good Morning " +s);
        sc.close();
    }
}

