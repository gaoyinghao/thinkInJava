package com.thinkinginjava.chapter3;

/**
 * �����������ȼ�
 * @ClassName:Precedence
 * @Description:�����������ȼ�
 * @author <a href="mailto:gaoyinghaosx@163.com" target="_blank">gaoyinghaosx@163.com</a>
 * @date:2016��7��25�� ����12:00:16
 */
public class Precedence {

	public static void main(String[] args) {
		int x = 1, y = 2, z = 3;
		int a = x + y - 2 / 2 + z;
		int b = x + (y - 2) / (2 + z);
		System.out.println("a=" + a + ",b=" + b);
		
		//a=5,b=1

	}

}
