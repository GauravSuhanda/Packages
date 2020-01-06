package bsc.gs.glider;

import java.util.*;

class MissingNumber {
    public static void main(String[] args) {
        //10 is missing
        int[] num1 = {1, 5, 3, 2};
        int[] num2 = {1, 2, 3, 4, 5, 6, 7, 8, 10};
        
        int N1 = 5;
        int N2 = 10;
        int idealSum1 = (N1 * (N1 + 1)) / 2;
        int idealSum2 = (N2 * (N2 + 1)) / 2;
        
        int sum1 = Arrays.stream(num1).sum();
        int sum2 = Arrays.stream(num2).sum();
        
        int missingNumber1 = idealSum1 - sum1;
        int missingNumber2 = idealSum2 - sum2;

        System.out.println(missingNumber1);
        System.out.println(missingNumber2);
    }
}