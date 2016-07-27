package com.thinkinginjava.chapter4;

import static net.mindview.util.Print.*;
/**
 * LabeledFor��ʾ
 * @ClassName: LabeledFor 
 * @Description: LabeledFor��ʾ
 * @author <a href="mailto:gaoyinghaosx@163.com" target="_blank">gaoyinghaosx@163.com</a>
 * @date 2016��7��27�� ����8:27:15
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

	}

}
