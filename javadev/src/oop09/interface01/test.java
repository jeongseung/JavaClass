package oop09.interface01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

public class test {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		Properties prop = new Properties();
		prop.load(new FileInputStream("src/oop09/interface01/product.properties"));
		String tvName = prop.getProperty("tv");
		System.out.println(tvName);
		Class tvClass = Class.forName(tvName);
		System.out.println("tvClass : " + tvClass);
		TV tv = (TV) tvClass.getConstructor().newInstance();
		tv.turnOn();
	}

}
