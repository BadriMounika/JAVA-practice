package search;

public class Maxin2d {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,10,9}};
        int res=maximum(arr);
        System.out.println(res);
    }
    static int maximum(int[][] arr){
        int max=arr[0][0];
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(max<arr[row][col]){
                    max=arr[row][col];
                }
            }
        }
        return max;
    }
}
