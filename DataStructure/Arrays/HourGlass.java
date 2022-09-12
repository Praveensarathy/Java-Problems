import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'hourglassSum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int hourglassSum(int[][] arr) {
        int i,j,n=arr.length;
        int [][]b = new int[4][4];
        int temp=0,max = 0;
        for(i=0;i<4;i++){
            for(j=0;j<4;j++){
                temp = arr[i][j] + arr[i][j+1]+
                arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+
                arr[i+2][j+1]+arr[i+2][j+2];
                if(temp > max){
                    max = temp;
                }
            }
        }
        return max;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int [][] arr = new int[6][6];
        for(int i =0;i<6;i++){
            for(int j =0;j<6;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
        int Res = Result.hourglassSum(arr);
        System.out.println(Res);
    }
}
