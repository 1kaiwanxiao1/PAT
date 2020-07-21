package com.daq.gread15;

import java.util.Scanner;

/**
 * 1056 ������ĺ� (15��)
 * 
 * @author: ChangSheng 
 * @date:   2020��7��4�� 
 * ����˼·:�����������ȫ������һ�飬������
 * ֪ʶ��:
 * 1.����ת�ַ���String.valueOf()
 * 2.�ַ���ת����Integer.valueOf()
 * 3.�ַ���ƴ��ֱ����+
 * 4.continue��ֹ����ѭ��,break����ѭ��
 */
public class main56 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
		int sum = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (i == j) {
					continue;
				}
				String splice = String.valueOf(arr[i]) + String.valueOf(arr[j]);
				sum += Integer.valueOf(splice);
			}
		}
		
		System.out.print(sum);
	}
}

