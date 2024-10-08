package conditionsandloops;
import java.util.*;
public class Triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter base and height:");
        int b=sc.nextInt();
        int h=sc.nextInt();
        float f=0.5f;
        float area=f*b*h;
        System.out.println(area);
        sc.close();
    }
}
