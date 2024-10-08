package conditionsandloops;
import java.util.*;
public class SumOfIntegers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter an Integer(enter 0 to finish):");
        
        int sum=0;
        while(true){
            int  n=sc.nextInt();
            if(n==0) break;
            sum+=n;
        }
        System.out.println(sum);
        sc.close();
    }
    
}
