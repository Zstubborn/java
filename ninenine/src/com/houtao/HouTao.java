package com.houtao;

/**
 * file description ��̲����һ�����ӣ���ֻ�������֡���һֻ���Ӱ��������ƾ�ݷ�Ϊ��ݣ�����һ����
 * ��ֻ���ӰѶ��һ�����뺣�У�������һ�ݡ��ڶ�ֻ���Ӱ�ʣ�µ�������ƽ���ֳ���ݣ��ֶ���һ����
 * ��ͬ���Ѷ��һ�����뺣�У�������һ�ݣ����������ġ�����ֻ���Ӷ����������ģ��ʺ�̲��ԭ�������ж��ٸ����ӣ�
 * 
 * @author zzhao
 * @version 1.0.0 HouTao.java 2015-8-4 ����11:53:19
 */
public class HouTao {
	static int ts = 0;// ��������
	static int fs = 1;// ��¼�ֵĴ���
	static int hs = 5;// ������...
	static int tsscope = 5000;// ��������ȡֵ��Χ.̫���������.

	public static void main(String[] args) {
		System.out.println(f(0));
	}

	public static int f(int t) {
		if (t == tsscope) {
			// ����������������ȡֵ��Χʱȡ���ݹ�
			return 0;
		} else {
			if ((t - 1) % hs == 0 && fs <= hs) {
				if (fs == hs) {
					System.out.println("������ = " + ts + " ʱ�����������");
					return ts;
				}
				fs += 1;
				return f((t - 1) / 5 * 4);// ���غ�������һ�ݺ��ʣ�µ�����
			} else {
				// û��������
				fs = 1;// �ֵĴ�������Ϊ1
				return f(ts += 1);// ��������+1
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
