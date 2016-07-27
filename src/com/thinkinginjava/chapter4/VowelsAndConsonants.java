package com.thinkinginjava.chapter4;

import java.util.Random;
import static net.mindview.util.Print.*;

/**
 * switch��ʾ
 * @ClassName:VowelsAndConsonants
 * @Description:switch��ʾ
 * @author <a href="mailto:gaoyinghaosx@163.com" target="_blank">gaoyinghaosx@163.com</a>
 * @date:2016��7��28�� ����12:15:01
 */
public class VowelsAndConsonants {

	public static void main(String[] args) {
		Random rand = new Random(47);
		for (int i = 0; i < 100; i++) {
			int c = rand.nextInt(26);
			c = c+'a';
			printnb((char) c + "," + c + ":");
			switch (c) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				print("vowel");
				break;
			case 'y':
			case 'w':
				print("Sometimes a vowel");
				break;
			default:
				print("consonant");
			}
		}
	}

}
