package com.daq.gread15;

import java.util.Scanner;

/**
 * 1086 �Ͳ������� (15��)
 * @author daq
 * ����˼·:
 * 1.����������StringBuilder��reverse()��������
 * 2.��������ʽƥ��
 *
 */
public class main86 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		mutply(A, B);
	}
	
	public static void mutply(int A,int B) {
		String reverse = new StringBuilder().append(A*B).reverse().toString(); // ����
		System.out.println(reverse.replaceAll("^0+", "")); // ȥ��ǰ���0���
	}

}
