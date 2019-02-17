import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//Print the number of subarrays of  having negative sums
public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int c = s.nextInt();

        int [] arr = new int[c];
        int maxCount=0;

            for(int i=0 ; i<c ; i++){
                // System.out.println(i);
                arr[i]=s.nextInt();
                int sum = 0;

                for(int j = i ; j>=0 ; j--){
                    sum+=arr[j];
                    System.out.println("sum: " + sum);

                    if(sum<0){
                        maxCount++;
                        // System.out.println(i+":"+j);
                    }
                    System.out.println("j: " + j);

                }
            }
        System.out.println(maxCount);
    }
}
