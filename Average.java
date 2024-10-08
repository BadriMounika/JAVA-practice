package conditionsandloops;
import java.util.*;
public class Average {
   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n numbers(enter 0 to finish):");
        int sum=0;
        while(true){
            int n=sc.nextInt();
            if(n==0) break;
            sum=n*(n+1)/2;
            


        }
        sc.close();
    }
}