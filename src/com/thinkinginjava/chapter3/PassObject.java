package com.thinkinginjava.chapter3;

import static net.mindview.util.Print.*;

class Letter {
	char c;
}

/**
 * ���������еı�������
 * @ClassName:PassObject
 * @Description:���������еı�������
 * @author gaoyinghaosx@163.com
 * @date:2016��7��27�� ����12:32:48
 */
public class PassObject {

	static void f(Letter y) {
		y.c = 'z';
	}

	public static void main(String[] args) {
		Letter x = new Letter();
		x.c = 'a';
		print("1:x.c:" + x.c);
		f(x);
		print("2:x.c:" + x.c);

		/*
		 * ����� 1:x.c:a 2:x.c:z
		 */
	}
}
