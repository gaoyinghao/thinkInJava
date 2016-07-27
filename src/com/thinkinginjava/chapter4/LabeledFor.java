package com.thinkinginjava.chapter4;

import static net.mindview.util.Print.*;
/**
 * LabeledFor演示
 * @ClassName: LabeledFor 
 * @Description: LabeledFor演示
 * @author <a href="mailto:gaoyinghaosx@163.com" target="_blank">gaoyinghaosx@163.com</a>
 * @date 2016年7月27日 下午8:27:15
 */
public class LabeledFor {

	public static void main(String[] args) {
		int i = 0;
		outer: for (; true;) {
			inner: for (; i < 10; i++) {
				print("i=" + i);
				if(i==2){
					print("continue");
					continue;
				}
				if(i==3){
					print("break");
					i++;
					break;
				}
				if(i==7){
					print("continue outer");
					i++;
					continue outer;
				}
				if(i==8){
					print("break outer");
					break outer;
				}
				for(int k=0;k<5;k++){
					if(k==3){
						print("continue inner k");
						continue inner;
					}
				}
			}
		}
		
/*		结果：
			i=0
			continue inner k
			i=1
			continue inner k
			i=2
			continue
			i=3
			break
			i=4
			continue inner k
			i=5
			continue inner k
			i=6
			continue inner k
			i=7
			continue outer
			i=8
			break outer
*/


	}

}
