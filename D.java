package firstjava;
import java.util.*;
public class D {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter two numbers:");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        if(n1>n2) System.out.println("Largest number:"+n1);
        else System.out.println("Largest number:"+n2);
        sc.close();


    }
}
