package com.daq.gread15;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * 1041 ������λ�� (15��)
 * @author pc
 * ����˼·:�����е�׼��֤�ŷ���һ��list�У�����Ҫ��ѯ��ͬѧ�Ի��ŷ���һ�������У������������ʱ�����жϡ�
 * ע������:����ĳ�ʼ��int[] arr = new int[m];�Ժ�Ҫ�ٴ���
 */
public class main41 {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		Integer n= Integer.parseInt(sc.nextLine());// ��������
		for (int i = 0; i < n; ++i) {
			list.add(sc.nextLine());
		}
		Integer m= Integer.parseInt(sc.nextLine());// ��������
		int[] arr = new int[m];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {
			get(list, arr[i]);
		}

	}

	static void get(ArrayList<String> list, int num) {
		for (String str : list) {
			if ((str.charAt(17) - '0') == num) {
				str = str.substring(0, 17) + str.charAt(19);
				System.out.println(str);
			}
		}
	}

}
