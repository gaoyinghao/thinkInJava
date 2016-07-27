package com.thinkinginjava.chapter3;

import static net.mindview.util.Print.*;

/**
 * 直接常量演示
 * @ClassName:Literals
 * @Description:直接常量演示
 * @author <a href="mailto:gaoyinghaosx@163.com" target="_blank">gaoyinghaosx@163.com</a>
 * @date:2016年7月27日 上午12:41:36
 */
public class Literals {
	public static void main(String[] args) {
		int i1 = 0x2f;
		print("i1: " + Integer.toBinaryString(i1));
		int i2 = 0X2F;
		print("i2: " + Integer.toBinaryString(i2));
		int i3 = 0177;
		print("i3: " + Integer.toBinaryString(i3));
		char c = 0xffff;
		print("c: " + Integer.toBinaryString(c));
		byte b = 0x7f;
		print("b: " + Integer.toBinaryString(b));
		short s = 0x7fff;
		print("s: " + Integer.toBinaryString(s));
		long n1 = 200L;
		long n2 = 200l;
		long n3 = 200;
		float f1 = 1;
		float f2 = 1F;
		float f3 = 1f;
		double d1 = 1d;
		double d2 = 1D;
		/* 结果：
		 	i1: 101111
			i2: 101111
			i3: 1111111
			c: 1111111111111111
			b: 1111111
			s: 111111111111111
		 */
	}
}