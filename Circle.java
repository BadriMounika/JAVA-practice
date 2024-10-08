package conditionsandloops;
import java.util.*;
public class Circle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter radius:");
       int r=sc.nextInt();
       double pie=3.14;
       double area=pie*r*r;
       System.out.println(area);
       sc.close();
    }
}
