package com.thinkinginjava.chapter3;

import static net.mindview.util.Print.*;

/**
 * �Զ������͵ݼ�
 * @ClassName:AutoInc
 * @Description:�Զ������͵ݼ�
 * @author <a href="mailto:gaoyinghaosx@163.com" target="_blank">gaoyinghaosx@163.com</a>
 * @date:2016��7��27�� ����12:35:52
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
		 * �����
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
