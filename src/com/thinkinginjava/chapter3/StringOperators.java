package com.thinkinginjava.chapter3;

import static net.mindview.util.Print.*;

/**
 * �ַ���������+��+=
 * @ClassName:StringOperators
 * @Description:�ַ���������+��+=
 * @author gaoyinghaosx@163.com
 * @date:2016��7��27�� ����12:46:35
 */
public class StringOperators {

	public static void main(String[] args) {
		int x = 0, y = 1, z = 2;
		String s = "x,y,z";
		print(s + x + y + z); // x,y,z012
		print(x + " " + s); // 0 x,y,z
		s += "(summed=)";
		print(s + (x + y + z)); // x,y,z(summed=)3
		print("" + x); // 0

	}

}
