package com.daq.gread15;

import java.util.Scanner;

/**
 * @author
 * @description (3n+1)������
 * ����˼·����һ��whileѭ�����ж������������������ż����Ȼ������Ӧ�Ĳ���������whileѭ������������ֹѭ��
 * �ܽ᣺��ʹ��λ���㣬ʹ��while����ѭ��
 */
public class main01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int count = 0;
        while (n!=1) {
            if (n % 2 == 0) {
                n=n>>1;
                count++;
            }else{
                n=(n*3+1)>>1;
                count++;
            }
        }
        System.out.println(count);
    }
}
