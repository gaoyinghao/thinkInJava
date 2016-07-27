package com.thinkinginjava.chapter3;

import static net.mindview.util.Print.*;

/**
 * 自动递增和递减
 * @ClassName:AutoInc
 * @Description:自动递增和递减
 * @author <a href="mailto:gaoyinghaosx@163.com" target="_blank">gaoyinghaosx@163.com</a>
 * @date:2016年7月27日 上午12:35:52
 */
public class AutoInc {

	public static void main(String[] args) {
		int i = 1;
		print("i :" + i);
		print("++i :" + ++i);
		print("i++ :" + i++);
		print("i :" + i);
		print("--i :" + --i);
		print("i-- :" + i--);
		print("i :" + i);

		/*
		 * 结果：
		 	i :1
			++i :2
			i++ :2
			i :3
			--i :2
			i-- :2
			i :1
		 */
	}
}
