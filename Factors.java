package conditionsandloops;

import java.util.*;
public class Factors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value");
        int n=sc.nextInt();
        System.out.println("The factors are:");
        for(int i=2;i<=n;i++){
            if(n%i==0){
            System.out.println(i);
            }
        }
          sc.close();  
        }
    }
