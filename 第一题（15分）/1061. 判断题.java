package com.daq.gread15;

import java.util.Scanner;
/**
 * 1061 �ж��� (15��)
 * @author pc
 *	����˼·����������Ϣ¼��һ����ά���飬�׿�ǰ���У�ѭ���жϺ���ģ��������Աȣ����ۼƷ�ֵ
 *  ע�����������ά���飬��forѭ�������
 */ 
public class main61 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//ѧ��������
		int m = sc.nextInt();//��Ŀ����
		int z =n + 2;
		//������¼��һ����ά����
		int[][] arr = new int[z][m];
		for (int i = 0; i < z; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		int sum=0;
		for (int i = 2; i < z; i++) {
			for (int j = 0; j < m; j++) {
				if(arr[i][j]==arr[1][j]) {
					sum+=arr[0][j];
				}
			}
			System.out.println(sum);//ÿһ��ѧ���ĳɼ������֮�����sum
			sum = 0;//������sum��λ0����һ�м���
		}
	}

}
