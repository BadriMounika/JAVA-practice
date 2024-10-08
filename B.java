package firstjava;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        int p,t,r,res;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter p,t,r values:");
        p=sc.nextInt();
        t=sc.nextInt();
        r=sc.nextInt();
        res=(p*t*r)/100;
        System.out.println("Simple Interest:" +res);
        sc.close();
    }
}
