import java.util.*;
public class BinaryIn2d {
    public static void main(String[] args) {
        int[][] arr={{10,20,30,40},{15,25,35,45},{28,29,37,49},{33,34,38,50}};
        System.out.println(Arrays.toString(search(arr, 37)));
        
    }
    public static int[] search(int[][] mat,int target){
        int r=0;
        int c=mat.length-1;
        while(r<mat.length-1 && c>=0){
            if(mat[r][c]==target){
                return new int[]{r,c};
            }
            if(target>mat[r][c]){
                r++;
            } else{
                c--;

            }
        }
        return new int[]{-1,-1};
    }
}
