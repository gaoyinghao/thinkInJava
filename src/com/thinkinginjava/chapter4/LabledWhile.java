package com.thinkinginjava.chapter4;

import static net.mindview.util.Print.*;

/**
 * LabledWhile��ʾ
 * @ClassName:LabledWhile
 * @Description:LabledWhile��ʾ
 * @author <a href="mailto:gaoyinghaosx@163.com" target="_blank">gaoyinghaosx@163.com</a>
 * @date:2016��7��27�� ����11:52:23
 */
public class LabledWhile {

	public static void main(String[] args) {
		int i = 0;
		outer: while (true) {
			print("Outer while loop");
			while (true) {
				i++;
				print("i=" + i);
				if (i == 1) {
					print("continue");
				}
				if (i == 3) {
					print("continue outer");
					continue outer;
				}
				if (i == 5) {
					print("break");
					break;
				}
				if (i == 7) {
					print("break outer");
					break outer;
				}
			}
		}
	}

}
