package com.thinkinginjava.chapter3;
import static net.mindview.util.Print.*;

/**
 * ��Ԫ��������if-else��ʾ
 * @ClassName:TernaryIfElse
 * @Description:��Ԫ��������if-else��ʾ
 * @author gaoyinghaosx@163.com
 * @date:2016��7��27�� ����12:45:36
 */
public class TernaryIfElse {

	static int ternary(int i) {
		return i < 10 ? i * 100 : i * 10;
	}

	static int standardIfElse(int i) {
		if (i < 10)
			return i * 100;
		else
			return i * 10;
	}

	public static void main(String[] args) {
		print(ternary(9));  //900
		print(ternary(10)); //100
		print(standardIfElse(9)); //900
		print(standardIfElse(10)); //100
	}

}
