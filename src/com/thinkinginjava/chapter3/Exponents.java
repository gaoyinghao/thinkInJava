package com.thinkinginjava.chapter3;

/**
 * 指数计数法演示
 * @ClassName:Exponents
 * @Description:指数计数法演示
 * @author <a href="mailto:gaoyinghaosx@163.com" target="_blank">gaoyinghaosx@163.com</a>
 * @date:2016年7月27日 上午12:44:06
 */
public class Exponents {
	public static void main(String[] args) {
		float expFloat = 1.39e-43f;
		expFloat = 1.39E-43f;
		System.out.println(expFloat);
		double expDouble = 47e47d;
		double expDouble2 = 47e47;
		System.out.println(expDouble);
		
		
		/*
		  结果：
		    1.39E-43
			4.7E48
		 */
	}
}
