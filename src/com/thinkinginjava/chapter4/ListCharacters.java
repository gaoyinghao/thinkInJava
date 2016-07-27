package com.thinkinginjava.chapter4;

/**
 * for循环演示
 * @ClassName: ListCharacters
 * @Description: for循环演示
 * @author <a href="mailto:gaoyinghaosx@163.com" target="_blank">gaoyinghaosx@163.com</a>
 * @date 2016年7月27日 上午10:21:28
 */
public class ListCharacters {

	public static void main(String[] args) {
		for (char c = 0; c < 128; c++) {
			if (Character.isLowerCase(c)) {  //检查字符是否为小写字母
				System.out.println("value:" + (int) c + "character:" + c);
			}
		}
		/*
		  结果:
	  		value:97character:a
			value:98character:b
			value:99character:c
			value:100character:d
			value:101character:e
			value:102character:f
			value:103character:g
			value:104character:h
			value:105character:i
			value:106character:j
			value:107character:k
			value:108character:l
			value:109character:m
			value:110character:n
			value:111character:o
			value:112character:p
			value:113character:q
			value:114character:r
			value:115character:s
			value:116character:t
			value:117character:u
			value:118character:v
			value:119character:w
			value:120character:x
			value:121character:y
			value:122character:z
		 */
	}

}
