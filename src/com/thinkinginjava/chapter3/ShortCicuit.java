package com.thinkinginjava.chapter3;

import static net.mindview.util.Print.*;

/**
 * ��·��ʾ
 * @ClassName:ShortCicuit
 * @Description:��·��ʾ
 * @author <a href="mailto:gaoyinghaosx@163.com" target="_blank">gaoyinghaosx@163.com</a>
 * @date:2016��7��27�� ����12:39:46
 */
public class ShortCicuit {

	static boolean test1(int val) {
		print("test1(" + val + ")");
		print("result:" + (val < 1));
		return val < 1;
	}

	static boolean test2(int val) {
		print("test2(" + val + ")");
		print("result:" + (val < 2));
		return val < 2;
	}

	static boolean test3(int val) {
		print("test3(" + val + ")");
		print("result:" + (val < 3));
		return val < 3;
	}

	public static void main(String[] args) {
		boolean b = test1(0) && test2(2) && test3(3);
		print("expression is " + b);

		/*
		 * ����� 
		 	test1(0)
			result:true
			test2(2)
			result:false
			expression is false

		  
		 */
	}

}
