package search;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr={6,4,5,6,7};
        int target=5;
        int res=search(arr, target,1,2);
        System.out.println(res);
        
    }
    public static int search(int[] arr,int target,int start,int end){
        if(arr.length==0){
            return -1;
        }
        for(int i=start;i<=end;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
