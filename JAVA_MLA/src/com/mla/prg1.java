package com.mla;
import java.util.*;
public class prg1 {
	public static void main(String[] args) {
//		System.out.println("HELOO");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			if(i%2 ==0) {
				System.out.println(i);
			}
		}
		System.out.println();
		int x=0;
		while(x<n) {
			if(x%2 != 0) {
				System.out.println(x);
			}
			x++;
		}
		System.out.println();
		if(n%2 ==0) {
			System.out.println("Even");
		}else {
			System.out.println("Odd");
		}
		
		sc.close();

	}
}
