package com.thinkinginjava.chapter4;

/**
 * whileѭ����ʾ
 * @ClassName:WhileTest
 * @Description:whileѭ����ʾ
 * @author gaoyinghaosx@163.com
 * @date:2016��7��27�� ����12:49:58
 */
public class WhileTest {

	static boolean condition() {
		boolean result = Math.random() < 0.99;
		System.out.println(result + ".");
		return result;
	}

	public static void main(String[] args) {
		while (condition()) {
			System.out.println("Inside 'while'");
			System.out.println("Exited 'while'");
		}

	}

}