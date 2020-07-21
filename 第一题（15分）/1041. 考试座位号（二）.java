package com.daq.gread15;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
/**
 * 1041 ������λ�� (15��)
 * @author daiaoqi
 * ����˼·:��һ��map����������Ϣ��׼��֤�ţ��Ի��ţ���������һ��node����ţ�keyֵ�����Ի���
 * ���ո���keyֵ����ȡvalue
 * 
 * ע������:
 * 1.��δӼ��̻�ȡֵ����ӵ�������
 * 2.mapҪ������
 */

public class main41_01 {

    static class Node {
        private String id;// ׼��֤��
        private int tryNumber;// �Ի���
        private int trueNumber;// ���Ժ�
        public Node(String id, int tryNumber, int trueNumber) {
            this.id = id;
            this.tryNumber = tryNumber;
            this.trueNumber = trueNumber;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nums = sc.nextInt();//���ٸ�׼��֤
        Map<Integer, Node> map = new HashMap<>();
        
        //��map��������ݡ�
        for (int i = 0; i < nums; i++) {
            String id = sc.next();
            int tryNumber = sc.nextInt();
            int trueNumber = sc.nextInt();
            map.put(tryNumber, new Node(id, tryNumber, trueNumber));
        }

        // ��Ҫ���ҵ�ѧ������
        int count = sc.nextInt();
        for (int i = 0; i < count; i++) {
            int tryNumber = sc.nextInt();
            Node node = map.get(tryNumber);
            System.out.println(node.id + " " + node.trueNumber);
        }
    }

}
