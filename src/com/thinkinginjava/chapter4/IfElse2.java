package com.thinkinginjava.chapter4;

import static net.mindview.util.Print.*;

/**
 * return演示
 * @ClassName: IfElse2 
 * @Description: return演示
 * @author <a href="mailto:gaoyinghaosx@163.com" target="_blank">gaoyinghaosx@163.com</a>
 * @date 2016年7月27日 下午7:40:44
 */
public class IfElse2 {

	static int test(int testval,int target){
		if(testval>target)
			return +1;
		else if(testval<target)
			return -1;
		else return 0;
	}

	public static void main(String[] args) {
		print(test(10, 5)); // 1
		print(test(5, 10)); // -1
		print(test(5, 5)); // 0
	}

}
