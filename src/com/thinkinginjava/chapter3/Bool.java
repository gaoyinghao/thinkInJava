package com.thinkinginjava.chapter3;

import java.util.Random;
import static net.mindview.util.Print.*;

/**
 * �߼���������ʾ
 * @ClassName:Bool
 * @Description:�߼���������ʾ
 * @author gaoyinghaosx@163.com
 * @date:2016��7��27�� ����12:38:44
 */
public class Bool {

	public static void main(String[] args) {
		Random rand = new Random(47);
		int i = rand.nextInt(100);
		int j = rand.nextInt(100);
		print("i = " + i); // 58
		print("j = " + j); // 55
		print("i > j is " + (i > j)); // true
		print("i < j is " + (i < j)); // false
		print("i >= j is " + (i >= j));// true
		print("i <= j is " + (i <= j)); // false
		print("i == j is " + (i == j)); // false
		print("i ��= j is " + (i != j)); // true
	}

}
