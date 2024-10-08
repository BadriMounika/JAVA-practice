package conditionsandloops;
import java.util.*;
public class Largest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number(enter 0 to finish):");
        int max=0;
        while(true){
            
            int n=sc.nextInt();
            if(n==0) break;
            max=Math.max(max,n);
        }
        System.out.println(max);
sc.close();
        








        
    }
}
