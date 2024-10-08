package search;

public class MaxWealth {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{1,2,3}};
        System.out.println(max(arr));
    }
    public static int max(int[][] arr){
        int max=arr[0][0];
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=0;j<arr[i].length;j++){
                sum+=arr[i][j];
            }
            if(sum>max){
                max=sum;
            }
            // if(sum==max){
            //     max=sum;
            // }
        }
        return max;
    }
    
}
