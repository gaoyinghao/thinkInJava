package com.thinkinginjava.chapter3;

import static net.mindview.util.Print.*;

/**
 * 字符串操作符+和+=
 * @ClassName:StringOperators
 * @Description:字符串操作符+和+=
 * @author <a href="mailto:gaoyinghaosx@163.com" target="_blank">gaoyinghaosx@163.com</a>
 * @date:2016年7月27日 上午12:46:35
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
