package com.thinkinginjava.chapter5;

import static net.mindview.util.Print.*;

/**
 * ��Ա��ʼ����ʾ
 * @ClassName: InitialValues 
 * @Description: ��Ա��ʼ����ʾ
 * @author <a href="mailto:gaoyinghaosx@163.com" target="_blank">gaoyinghaosx@163.com</a>
 * @date 2016��8��3�� ����7:53:16
 */
public class InitialValues {

	boolean t;
	char c;
	byte b;
	short s;
	int i;
	long l;
	float f;
	double d;
	InitialValues reference;

	void printInitialValues() {
		print("Data type		Initial value");
		print("boolean				" + t);
		print("byte				" + b);
		print("short				" + s);
		print("int				" + i);
		print("long				" + l);
		print("float				" + f);
		print("double				" + d);
		print("reference		   	" + reference);
	}

	public static void main(String[] args) {
		InitialValues iv = new InitialValues();
		iv.printInitialValues();
	}
}
