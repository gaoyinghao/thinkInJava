package com.thinkinginjava.chapter5;

import static net.mindview.util.Print.*;

/**
 * 成员初始化演示
 * @ClassName: InitialValues 
 * @Description: 成员初始化演示
 * @author <a href="mailto:gaoyinghaosx@163.com" target="_blank">gaoyinghaosx@163.com</a>
 * @date 2016年8月3日 下午7:53:16
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
