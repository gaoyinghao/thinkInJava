package com.thinkinginjava.chapter4;

/**
 * ���Ų�������ʾ
 * @ClassName: CommaOperator
 * @Description: ���Ų�������ʾ
 * @author gaoyinghaosx@163.com
 * @date 2016��7��27�� ����10:44:53
 */
public class CommaOperator {

	public static void main(String[] args) {
		// ����ֻ������forѭ���ĳ�ʼ���Ͳ������Ʋ��֡�
		// ͨ�����Ų�����������for��䶨���������������Ǳ��������ͬ������
		for (int i = 1, j = i + 10; i < 5; i++, j = i * 2) {
			System.out.println("i=" + i + "  j=" + j);
		}

	}

}
