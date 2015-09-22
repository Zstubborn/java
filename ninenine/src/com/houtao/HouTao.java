package com.houtao;

/**
 * file description 海滩上有一堆桃子，五只猴子来分。第一只猴子把这堆桃子凭据分为五份，多了一个，
 * 这只猴子把多的一个扔入海中，拿走了一份。第二只猴子把剩下的桃子又平均分成五份，又多了一个，
 * 它同样把多的一个扔入海中，拿走了一份，第三、第四、第五只猴子都是这样做的，问海滩上原来最少有多少个桃子？
 * 
 * @author zzhao
 * @version 1.0.0 HouTao.java 2015-8-4 上午11:53:19
 */
public class HouTao {
	static int ts = 0;// 桃子总数
	static int fs = 1;// 记录分的次数
	static int hs = 5;// 猴子数...
	static int tsscope = 5000;// 桃子数的取值范围.太大容易溢出.

	public static void main(String[] args) {
		System.out.println(f(0));
	}

	public static int f(int t) {
		if (t == tsscope) {
			// 当桃子数到了最大的取值范围时取消递归
			return 0;
		} else {
			if ((t - 1) % hs == 0 && fs <= hs) {
				if (fs == hs) {
					System.out.println("桃子数 = " + ts + " 时满足分桃条件");
					return ts;
				}
				fs += 1;
				return f((t - 1) / 5 * 4);// 返回猴子拿走一份后的剩下的总数
			} else {
				// 没满足条件
				fs = 1;// 分的次数重置为1
				return f(ts += 1);// 桃子数加+1
			}
		}
	}
	
	public static int gg(int t){
		if(t == tsscope){
			System.out.println();
			return 0;
		}else{
			if((t - 1) % hs == 0 && fs <= hs){
				if(fs == hs){
					return ts;
				}
				fs += 1;
				return gg(ts += 1);
			}else{
				fs = 1;
				return gg(ts += 1);
			}
		}
	}

}
