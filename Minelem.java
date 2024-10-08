package search;

public class Minelem {
    public static void main(String[] args) {
        int[] arr={56,43,21,67};
        int res=minimum(arr);
        System.out.println(res);
    }
    static int minimum(int[] arr){
        int ans=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<ans){
                ans=arr[i];
            }
        }
        return ans;
    }
}
