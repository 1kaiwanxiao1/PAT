package com.daq.gread15;

import java.util.Scanner;

/**
 * 1036 ���°���һ���� (15��)
 * 
 * @author daiaoqi 
 * ����˼·:��һ�к����һ�������Ӧ�������ַ��������е�һ���ַ������һ���ַ�������ɣ���forѭ��������м�Ŀո�
 *         
 * ע������: 
 * 1.����print(),printf(),println()������     
 * 2.ʹ��Math.round(n/2.0)�������������룬����Ĳ�����double���ͣ���������λ���㡣�õ��Ľ��Ҫ����ǿ������ת����
 * 3.��trim()ȥ���ո�
 *
 */

public class main36 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();//���ٸ���
		String C = s.next();//ָ���ַ�
		int column = (int) Math.round(N / 2.0);//����
		
		for (int i = 0; i < column; i++) { // ��
			for (int j = 0; j < N; j++) { // ��
				if (i == 0 || i == column - 1) {
					System.out.print(C);
				} else {
					if (j == 0 || j == N - 1) {
						System.out.print(C);
					} else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}
}
