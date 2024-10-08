package search;

public class Linearelem {
    public static void main(String[] args) {
        int[] arr={67,6,54,3,2,7};
        int target=21;
        int res=search(arr, target);
        System.out.println(res);
        
    }
    public static int search(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            if(target==arr[i]){
                return arr[i];
            }
        }
        return -1;
    }
}
