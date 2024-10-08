package search;

public class Ceiling {
    public static void main(String[] args) {
        int[] arr={2,3,5,9,14,16,18};
        int target=144;
        int ans=ceiling(arr, target);
        System.out.println(ans);
    }
    static int ceiling(int[] arr,int target){

//edge case
if(target>arr.length-1){  //if target value is greater than greatest number in the array
    return -1;
}


        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>arr[mid]){
                start=mid+1;

            }
            else if(target<arr[mid]){
                end=mid-1;
            }
            else{
                return mid;
            }

        }
        return start;   //return index of 16
    }
}

