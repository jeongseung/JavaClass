package oop25.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class RelectionTest3 {
	public static void main(String[] args) {
		Class<?> cls = Worker.class;
		
		Constructor<?>[] constructors = cls.getDeclaredConstructors(); //Worker의 생성자들을 배열로 얻어온다
		System.out.println("*********************************[생성자]****************************************");
//		System.out.println(Arrays.toString(constructors));
		for(int i=0; i<constructors.length; i++) {
			System.out.println(constructors[i]);
		}
		System.out.println();
		
		
		Method[] methods= cls.getDeclaredMethods(); //Worker의 메서드들을 배열로 얻어온다
		System.out.println("*********************************[메서드]****************************************");
		for(int i=0; i<methods.length; i++) {
			System.out.println(methods[i]);
		}
		System.out.println();

		Field[] fields= cls.getDeclaredFields(); //Worker의 필드들을 배열로 얻어온다
		System.out.println("*********************************[필드]****************************************");
		for(int i=0; i<fields.length; i++) {
			System.out.println(fields[i]);
		}
		System.out.println();
	}

}
