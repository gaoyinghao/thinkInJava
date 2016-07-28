package com.thinkinginjava.chapter5;

import static net.mindview.util.Print.*;

/**
 * 在构造器中调用构造器
 * @ClassName: Flower 
 * @Description: 在构造器中调用构造器
 * @author <a href="mailto:gaoyinghaosx@163.com" target="_blank">gaoyinghaosx@163.com</a>
 * @date 2016年7月28日 下午2:44:52
 */
public class Flower {
	int petalCount = 0;
	String s = "initial value";

	Flower(int petals) {
		petalCount = petals;
		print("Constructor w/ int arg only, petalCount= " + petalCount);
	}

	Flower(String ss) {
		print("Constructor w/ String arg only, s = " + ss);
		s = ss;
	}

	Flower(String s, int petals) {
		this(petals);
		this.s = s; 
		print("String & int args");
	}

	Flower() {
		this("hi", 47);
		print("default constructor (no args)");
	}

	void printPetalCount() {
		print("petalCount = " + petalCount + " s = " + s);
	}

	public static void main(String[] args) {
		Flower x = new Flower();
		x.printPetalCount();
	}
}
