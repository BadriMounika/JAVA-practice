package search;

public class Linear {
    public static void main(String[] args) {
        int[] arr={3,5,7,6,13,1};
        int target=13;
        int res=search(arr,target);
        System.out.println(res);
        
    }
    public static int search(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            if(target==arr[i]){
                return i;
            }
        }
        return -1;
    }
}
