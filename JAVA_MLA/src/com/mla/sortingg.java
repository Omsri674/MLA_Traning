package com.mla;
import java.util.Scanner;
import java.util.Arrays;
public class sortingg {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++) {
            arr[i] = in.nextInt();
        }
        int l = 0, r = arr.length - 1;

        while (l < r) {
            while (arr[l] % 2 == 0 && l < r)
                l++;
            while (arr[r] % 2 != 0 && l < r)
                r--;
            if (l < r) {
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
                r--;
            }
        }
        in.close();
        System.out.println();
        for(int e : arr){
            System.out.print(e+" ");
        }
    }
}

