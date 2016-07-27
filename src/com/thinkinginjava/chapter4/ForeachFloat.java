package com.thinkinginjava.chapter4;

import java.util.Random;

/**
 * foreach演示
 * @ClassName: ForeachFloat 
 * @Description: foreach演示
 * @author <a href="mailto:gaoyinghaosx@163.com" target="_blank">gaoyinghaosx@163.com</a>
 * @date 2016年7月27日 上午10:55:47
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
