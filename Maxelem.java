package search;

public class Maxelem {
    public static void main(String[] args) {
        int[] arr={56,67,78,32};
        int res=maximum(arr);
        System.out.println(res);
    }
    static int maximum(int[] arr){
        int ans=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>ans){
                ans=arr[i];
            }
        }
        return ans;
    }
}
