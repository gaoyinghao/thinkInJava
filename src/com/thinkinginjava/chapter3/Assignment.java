package com.thinkinginjava.chapter3;

import static net.mindview.util.Print.*;

class Tank {
	int level;
}

/**
 * 给对象赋值
 * @ClassName:Assignment
 * @Description:给对象赋值
 * @author gaoyinghaosx@163.com
 * @date:2016年7月27日 上午12:28:44
 */
public class Assignment {

	public static void main(String[] args) {
		Tank t1 = new Tank();
		Tank t2 = new Tank();
		t1.level = 9;
		t2.level = 47;
		print("1:t1.level:" + t1.level + ",t2.level:" + t2.level);
		t1 = t2;
		print("2:t1.level:" + t1.level + ",t2.level:" + t2.level);
		t1.level = 27;
		print("3:t1.level:" + t1.level + ",t2.level:" + t2.level);

		/*
		 * 结果： 
		 	1:t1.level:9,t2.level:47
			2:t1.level:47,t2.level:47
			3:t1.level:27,t2.level:27
		 */
	}
}
