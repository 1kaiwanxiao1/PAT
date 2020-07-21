package com.daq.gread15;

import java.util.ArrayList;
import java.util.Scanner;

public class main31 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine()); // ���֤ ����
		
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < n; ++i) {
			list.add(sc.nextLine());
		} // ����������
		
		boolean isAllPassed = true;// ���ñ�־λ
		for (String str : list) {
			if (!check(str.substring(0, 17), str.charAt(17))) {//���õ���Z�����֤���һλ�Ա�
				isAllPassed = false;//ֻҪ��һλ�������ͽ���־λ��Ϊfalse
				System.out.println(str);
			}
		}

		if (isAllPassed) {
			System.out.println("All passed");
		}
	}

	static boolean check(String sub, char m) {

		int[] value = { 7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2 };// Ȩ��
		char[] arr = { '1', '0', 'X', '9', '8', '7', '6', '5', '4', '3', '2' };// ��Ӧ������

		// �õ���
		int sum = 0;
		for (int i = 0; i < sub.length(); i++) {
			sum += value[i] * (sub.charAt(i) - '0');
		}

		// ģ11���õ�Z
		if (m == arr[sum % 11]) {
			return true;
		}
		return false;
	}

}
