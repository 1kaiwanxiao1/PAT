package com.daq.gread15;

import java.util.Scanner;

public class main66 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();//��
		int N = sc.nextInt();//��
		int A = sc.nextInt();//�˵�A
		int B = sc.nextInt();//�˵�B
		int C = sc.nextInt();//�滻ֵ
		
		int[][] arr = new int[M][N];
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		for (int i = 0; i < M; i++) {
			boolean flag = true;
			for (int j = 0; j < N; j++) {
				if(arr[i][j]>=A && arr[i][j]<=B) {
					System.out.printf("%s%03d", flag == true ? "" : " ", C);
				}else{
					System.out.printf("%s%03d", flag == true ? "" : " ", arr[i][j]);
				}
				flag = false;
			}
			System.out.println();
		}
		
	}
	

}
