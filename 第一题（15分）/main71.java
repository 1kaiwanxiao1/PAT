package com.daq.gread15;

import java.util.Scanner;

public class main71 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();// ��ҳ�����
		int K = sc.nextInt();// ������Ϸ

		int[][] arr = new int[K][4];
		for (int i = 0; i < K; i++) {
			for (int j = 0; j < 4; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		int num;
		for (int i = 0; i < K; i++) {

			// �жϳ����Ƿ�
			if (T > 0 && T < arr[i][2]) {// �г��룬���ǲ�����
				System.out.println("Not enough tokens.  Total = " + T + ".");
				continue;
			} else if (T == 0) {// һ�����붼û����
				System.out.println("Game Over.");
				break;// ֱ�ӽ���ѭ��
			}

			// �жϴ�С
			if (arr[i][0] > arr[i][3]) {
				num = 0;
			}else{
				num = 1;
			}
				// ����ҶĵĴ�С�Ƿ���ȷ
				if (arr[i][1] == num) {
					T = T + arr[i][2];
					System.out.println("Win " + arr[i][2] + "!  Total = " + T + ".");
				} else if (arr[i][1] != num) {
					T = T - arr[i][2];
					System.out.println("Lose " + arr[i][2] + ".  Total = " + T + ".");
				}

			}
		}

	}
