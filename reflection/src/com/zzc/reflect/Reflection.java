package com.zzc.reflect;

import java.lang.reflect.Array;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.junit.Test;

/**
 * java�������
 * 
 * @author zzhao
 * @version 1.0.0 Reflection.java 2015-9-22 ����9:34:49
 */

public class Reflection {
	
	public static void main(String[] args) {
		Object o = new Object();
		Class classz = o.getClass();
		Field[] field = classz.getFields();
	}
	/**
	 * �õ�ĳ������Ĺ�������
	 * 
	 * @param owner
	 *            , fieldName
	 * @return �����Զ���
	 * @throws Exception
	 */
	@Test
	public Object getProperty(Object owner, String fieldName) throws Exception {
		Class ownerClass = owner.getClass();
		System.out.println(ownerClass);

		Field field = ownerClass.getField(fieldName);//��ȡ�ֶ�

		Object property = field.get(owner);

		return property;
	}

	/**
	 * �õ�ĳ��ľ�̬��������
	 * 
	 * @param className
	 *            ����
	 * @param fieldName
	 *            ������
	 * @return �����Զ���
	 * @throws Exception
	 */
	public Object getStaticProperty(String className, String fieldName) throws Exception {
		Class ownerClass = Class.forName(className);

		Field field = ownerClass.getField(fieldName);

		Object property = field.get(ownerClass);

		return property;
	}

	/**
	 * ִ��ĳ���󷽷�
	 * 
	 * @param owner
	 *            ����
	 * @param methodName
	 *            ������
	 * @param args
	 *            ����
	 * @return ��������ֵ
	 * @throws Exception
	 */
	public Object invokeMethod(Object owner, String methodName, Object[] args) throws Exception {

		Class ownerClass = owner.getClass();

		Class[] argsClass = new Class[args.length];

		for (int i = 0, j = args.length; i < j; i++) {
			argsClass[i] = args[i].getClass();
		}

		Method method = ownerClass.getMethod(methodName, argsClass);

		return method.invoke(owner, args);
	}

	/**
	 * ִ��ĳ��ľ�̬����
	 * 
	 * @param className
	 *            ����
	 * @param methodName
	 *            ������
	 * @param args
	 *            ��������
	 * @return ִ�з������صĽ��
	 * @throws Exception
	 */
	public Object invokeStaticMethod(String className, String methodName, Object[] args) throws Exception {
		Class ownerClass = Class.forName(className);

		Class[] argsClass = new Class[args.length];

		for (int i = 0, j = args.length; i < j; i++) {
			argsClass[i] = args[i].getClass();
		}

		Method method = ownerClass.getMethod(methodName, argsClass);

		return method.invoke(null, args);
	}

	/**
	 * �½�ʵ��
	 * 
	 * @param className
	 *            ����
	 * @param args
	 *            ���캯���Ĳ���
	 * @return �½���ʵ��
	 * @throws Exception
	 */
	public Object newInstance(String className, Object[] args) throws Exception {
		Class newoneClass = Class.forName(className);

		Class[] argsClass = new Class[args.length];

		for (int i = 0, j = args.length; i < j; i++) {
			argsClass[i] = args[i].getClass();
		}

		Constructor cons = newoneClass.getConstructor(argsClass);

		return cons.newInstance(args);

	}

	/**
	 * �ǲ���ĳ�����ʵ��
	 * 
	 * @param obj
	 *            ʵ��
	 * @param cls
	 *            ��
	 * @return ��� obj �Ǵ����ʵ�����򷵻� true
	 */
	public boolean isInstance(Object obj, Class cls) {
		return cls.isInstance(obj);
	}

	/**
	 * �õ������е�ĳ��Ԫ��
	 * 
	 * @param array
	 *            ����
	 * @param index
	 *            ����
	 * @return ����ָ��������������������ֵ
	 */
	public Object getByArray(Object array, int index) {
		return Array.get(array, index);
	}
}
