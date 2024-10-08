package search;

public class EvenDigits {
    public static void main(String[] args) {
        int[] nums={12,345,67,89};
        System.out.println(findnumbers(nums));
    }
    static int findnumbers(int[] nums){
        int evencount=0;
        for(int i:nums){
            if(even(i)){
                evencount++;
            }
        }
        return evencount;
    }
    static boolean even(int i){
        int nod=digits2(i);
        return nod%2==0;
    }

    static int digits2(int i){
        return (int)(Math.log10(i))+1;
    }
    // static int digits(int i){
    //     if(i<0){
    //         i=i*-1;
    //     }
    //     if(i==0){
    //         return 0;
    //     }
    //     int count=0;
    //     while(i>0){
    //         count++;
    //         i/=10;
    //     }
    //     return count;
    // }
}
