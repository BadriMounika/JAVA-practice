package conditionsandloops;
import java.util.*;


public class Rectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter base and height:");
        int b=sc.nextInt();
        int h=sc.nextInt();
        int area=b*h;
        System.out.println(area);
        sc.close();
    }
}
