package com.example.demo.util;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class TestDemo {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(111);
		try {
			list.getClass().getMethod("add", Object.class).invoke(list, "abc");
			list.getClass().getMethod("add", Object.class).invoke(list, "这他妈是反射注入的非整数型对象");
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException
				| SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println(list.getClass());
		Integer i1 = 100;
		Integer i2 = 100;
		Integer i3 = 128;
		Integer i4 = 128;
		int i5=128;
		int i6=128;
		Integer i7 = -128;
		Integer i8 = -128;
		System.out.println(i1 == i2);
		System.out.println(i3 == i4);
		System.out.println(i5 == i6);
		System.out.println(i7 == i8);
	}
}
