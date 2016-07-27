package com.thinkinginjava.chapter4;

/**
 * Break和Continue演示
 * @ClassName: BreakAndContinue
 * @Description: Break和Continue演示
 * @author <a href="mailto:gaoyinghaosx@163.com" target="_blank">gaoyinghaosx@163.com</a>
 * @date 2016年7月27日 下午8:01:53
 */
public class BreakAndContinue {

	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			if (i == 74)
				break;
			if (i % 9 != 0)
				continue;
			System.out.print(i + "   "); // 0 9 18 27 36 45 54 63 72
		}

	}

}
