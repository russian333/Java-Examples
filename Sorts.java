package edu.ctc.whatcom.colemanBrody;

import java.util.Arrays;

public class Sorts {

    public static int[] bubbleSort(int[] n,int col){
        for(int i =0;i<n.length;i++) {
            for (int j = i + 1; j < n.length; j++) {
                if (((n[i]/((int)Math.pow(10,col)))%10)>((n[j]/((int)Math.pow(10,col)))%10)) {
                    int temp = n[i];
                    n[i]=n[j];
                    n[j]=temp;
                }
            }
        }
        return n;
    }

    public static void radixSort(int[] nums) {
        for(int c = 0;c<(nums[0]+"").length();c++){
            nums = bubbleSort(nums,c);
            System.out.println(Arrays.toString(nums));
        }
    }
}
