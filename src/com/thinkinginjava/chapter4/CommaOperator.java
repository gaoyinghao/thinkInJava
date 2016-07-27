package com.thinkinginjava.chapter4;

/**
 * 逗号操作符演示
 * @ClassName: CommaOperator
 * @Description: 逗号操作符演示
 * @author gaoyinghaosx@163.com
 * @date 2016年7月27日 上午10:44:53
 */
public class CommaOperator {

	public static void main(String[] args) {
		// 逗号只能用在for循环的初始化和步进控制部分。
		// 通过逗号操作符可以在for语句定义多个变量，但他们必须具有相同的类型
		for (int i = 1, j = i + 10; i < 5; i++, j = i * 2) {
			System.out.println("i=" + i + "  j=" + j);
		}

	}

}
