package com.thinkinginjava.chapter4;

import java.util.Random;

/**
 * foreach��ʾ
 * @ClassName: ForeachFloat 
 * @Description: foreach��ʾ
 * @author <a href="mailto:gaoyinghaosx@163.com" target="_blank">gaoyinghaosx@163.com</a>
 * @date 2016��7��27�� ����10:55:47
 */
public class ForeachFloat {

	public static void main(String[] args) {
		Random rand = new Random(47);
		float[] f = new float[10];
		for (int i = 0; i < 10; i++) {
			f[i] = rand.nextFloat();
		}
		
		for (float g : f) {
			System.out.println(g);
		}

	}

}
