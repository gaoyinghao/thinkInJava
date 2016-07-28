package com.thinkinginjava.chapter5;

import static net.mindview.util.Print.*;

class Tree {
	int height;

	Tree() {
		print("Plantint a seedling");
		height = 0;
	}

	Tree(int initialHeight) {
		height = initialHeight;
		print("Creating new Tree that is " + height + " feet tall");
	}

	void info() {
		print("Tree is " + height + " feet tall");
	}

	void info(String s) {
		print(s + ":Tree is " + height + " feet tall");
	}
}

/**
 * ���������غͷ���������ʾ
 * @ClassName: Overloading 
 * @Description: ���������غͷ���������ʾ
 * @author <a href="mailto:gaoyinghaosx@163.com" target="_blank">gaoyinghaosx@163.com</a>
 * @date 2016��7��28�� ����12:13:27
 */
public class Overloading {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			Tree t = new Tree(i);
			t.info();
			t.info("overloaded method");
		}
		new Tree();

	}

}
