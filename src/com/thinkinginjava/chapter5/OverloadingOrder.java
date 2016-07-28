package com.thinkinginjava.chapter5;

import static net.mindview.util.Print.*;

/**
 * 方法重载演示
 * @ClassName: OverloadingOrder 
 * @Description: 方法重载演示
 * @author <a href="mailto:gaoyinghaosx@163.com" target="_blank">gaoyinghaosx@163.com</a>
 * @date 2016年7月28日 下午1:53:34
 */
public class OverloadingOrder {

	static void f(String s, int i) {
		print("String:" + s + ",int:" + i);
	}

	static void f(int i, String s) {
		print("int:" + i + ",String:" + s);
	}

	public static void main(String[] args) {
		f("String first", 11);
		f(99, "Int first");
		// String:String first,int:11
		// int:99,String:Int first
	}

}
