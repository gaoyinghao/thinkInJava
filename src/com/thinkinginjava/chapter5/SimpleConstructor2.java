package com.thinkinginjava.chapter5;

class Rock2{
	Rock2(int i){
		System.out.print("Rock"+i+"  ");
	}
}
/**
 * 带参数构造器的演示
 * @ClassName:SimpleConstructor
 * @Description:带参数构造器的演示
 * @author <a href="mailto:gaoyinghaosx@163.com" target="_blank">gaoyinghaosx@163.com</a>
 * @date:2016年7月28日 上午12:46:23
 */
public class SimpleConstructor2 {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			new Rock2(i);
		}

	}

}
