package search;

public class Minin2d {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        int res=minimum(arr);
        System.out.println(res);
    }
    static int minimum(int[][] arr){
        int min=arr[0][0];
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]<min){
                    min=arr[row][col];
                }
            }
        }
        return min;
    }
}
