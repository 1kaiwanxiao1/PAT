package com.daq.gread15;

import java.util.Scanner;

/**
 * 1046 ��ȭ (15��)
 * 
 * @author daiaoqi
 * @date 2020.7.4
 * ����˼·:��ÿ��������ӵ���ά�����У�Ȼ��ȽϺ���֮���뻮����˭���˭��Ӯ
 * ע������:����һ��֪��������£�ѡ�ö�ά���顣
 */

public class main46 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[][] arr = new int[n][4];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 4; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int a = 0;// ��Ӯ��
		int b = 0;// ��Ӯ��
		for (int i = 0; i < n; i++) {
			int sum = arr[i][0] + arr[i][2];
			if (sum == arr[i][1] && sum != arr[i][3]) {
				a++;
			} else if (sum == arr[i][3] && sum != arr[i][1]) {
				b++;
			}
		}

		System.out.println(b + " " + a);
	}

}
