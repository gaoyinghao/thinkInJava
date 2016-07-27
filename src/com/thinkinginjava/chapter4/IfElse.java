package com.thinkinginjava.chapter4;

import static net.mindview.util.Print.*;

/**
 * if-else��ʾ
 * @ClassName:IfElse
 * @Description:if-else��ʾ
 * @author <a href="mailto:gaoyinghaosx@163.com" target="_blank">gaoyinghaosx@163.com</a>
 * @date:2016��7��27�� ����12:49:10
 */
public class IfElse {

	static int result = 0;

	static void test(int testval, int targer) {
		if (testval > targer) {
			result = +1;
		} else if (testval < targer) {
			result = -1;
		} else {
			result = 0;
		}
	}

	public static void main(String[] args) {
		test(10, 5);
		print(result); // 1
		test(5, 10);
		print(result); // -1
		test(5, 5);
		print(result); // 0
	}

}
