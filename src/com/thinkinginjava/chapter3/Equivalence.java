package com.thinkinginjava.chapter3;

class Value {
	int i;
}

/**
 * ���Զ���ĵȼ���
 * @ClassName:Equivalence
 * @Description:���Զ���ĵȼ���
 * @author gaoyinghaosx@163.com
 * @date:2016��7��27�� ����12:37:24
 */
public class Equivalence {

	public static void main(String[] args) {
		Integer t1 = new Integer(47);
		Integer t2 = new Integer(47);
		System.out.println(t1 == t2); // false
		System.out.println(t1 != t2); // true
		System.out.println(t1.equals(t2));// true

		Value v1 = new Value();
		Value v2 = new Value();
		v1.i = v2.i = 100;
		// equals����Ĭ�ϱȽϵ��Ƕ��������
		System.out.println(v1.equals(v2)); // false
		System.out.println(v1 == v2); // false
	}

}
