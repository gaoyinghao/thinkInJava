package com.thinkinginjava.chapter3;
import static net.mindview.util.Print.*;

/**
 * 三元操作符和if-else演示
 * @ClassName:TernaryIfElse
 * @Description:三元操作符和if-else演示
 * @author gaoyinghaosx@163.com
 * @date:2016年7月27日 上午12:45:36
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
