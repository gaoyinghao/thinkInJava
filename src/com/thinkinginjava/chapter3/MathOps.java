package com.thinkinginjava.chapter3;

import java.util.Random;

import static net.mindview.util.Print.*;

/**
 * 算术操作符演示
 * @ClassName:MathOps
 * @Description:算术操作符演示
 * @author <a href="mailto:gaoyinghaosx@163.com" target="_blank">gaoyinghaosx@163.com</a>
 * @date:2016年7月27日 上午12:34:02
 */
public class MathOps {

	public static void main(String[] args) {
		Random rand = new Random(47);
		int i, j, k;
		// 产生一个1到100之间的随机数
		j = rand.nextInt(100) + 1;
		print("j :" + j);
		k = rand.nextInt(100) + 1;
		print("k :" + k);
		i = j + k;
		print("j + k :" + i);
		i = j - k;
		print("j - k :" + i);
		i = k / j;
		print("k / j :" + i);
		i = k * j;
		print("k * j :" + i);
		i = k % j;
		print("k % j :" + i);
		j %= k;
		print("j %= k:" + j);

		float u, v, w;
		v = rand.nextFloat();
		print("v :" + v);
		w = rand.nextFloat();
		print("w :" + w);
		u = v + w;
		print("v + w :" + u);
		u = v - w;
		print("v - w :" + u);
		u = v * w;
		print("v * w:" + u);
		u = v / w;
		print("v / w :" + u);
		u += v;
		print("u += v :" + u);
		u -= v;
		print("u -=v :" + u);
		u *= v;
		print("u *= v:" + u);
		u /= v;
		print("u /= v:" + u);

		/*
		 * 结果: 
		 	j :59
			k :56
			j + k :115
			j - k :3
			k / j :0
			k * j :3304
			k % j :56
			j %= k:3
			v :0.5309454
			w :0.0534122
			v + w :0.5843576
			v - w :0.47753322
			v * w:0.028358962
			v / w :9.940527
			u += v :10.471473
			u -=v :9.940527
			u *= v:5.2778773
			u /= v:9.940527
		 */

	}

}
