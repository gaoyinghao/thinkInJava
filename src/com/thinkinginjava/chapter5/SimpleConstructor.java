package com.thinkinginjava.chapter5;

class Rock{
	Rock(){
		System.out.print("Rock  ");
	}
}
/**
 * �򵥵Ĺ�������ʾ
 * @ClassName:SimpleConstructor
 * @Description:�򵥵Ĺ�������ʾ
 * @author <a href="mailto:gaoyinghaosx@163.com" target="_blank">gaoyinghaosx@163.com</a>
 * @date:2016��7��28�� ����12:46:23
 */
public class SimpleConstructor {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			new Rock();
		}

	}

}
