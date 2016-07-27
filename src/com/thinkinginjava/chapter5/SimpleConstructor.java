package com.thinkinginjava.chapter5;

class Rock{
	Rock(){
		System.out.print("Rock  ");
	}
}
/**
 * 简单的构造器演示
 * @ClassName:SimpleConstructor
 * @Description:简单的构造器演示
 * @author <a href="mailto:gaoyinghaosx@163.com" target="_blank">gaoyinghaosx@163.com</a>
 * @date:2016年7月28日 上午12:46:23
 */
public class SimpleConstructor {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			new Rock();
		}

	}

}
