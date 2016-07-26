package com.thinkinginjava.chapter3;

import static net.mindview.util.Print.*;

class Letter {
	char c;
}

/**
 * 方法调用中的别名问题
 * @ClassName:PassObject
 * @Description:方法调用中的别名问题
 * @author gaoyinghaosx@163.com
 * @date:2016年7月27日 上午12:32:48
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
		 * 结果： 1:x.c:a 2:x.c:z
		 */
	}
}
