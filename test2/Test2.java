package com.bbb.test2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test2 {
	public static void main(String[] args) {
		Student p = new Student("zhangsan", '男', 1980, 37, 0);
		File f = new File("F:\\student.txt");
		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 将Person对象序列化的过程
		try {
			ObjectOutputStream oo = new ObjectOutputStream(new FileOutputStream(f));
			oo.writeObject(p);
			oo.flush();
			oo.close();
			// 将字节反序列化对象
			ObjectInputStream oi = new ObjectInputStream(new FileInputStream(f));

			Student p1 = (Student) oi.readObject();
			System.out.println("读取序列化对象的名字: "+p1.getName());
			System.out.println("读取序列化对象的性别: "+p1.getSex());
			System.out.println("读取序列化对象的出生年份: "+p1.getYear());
			System.out.println("读取序列化对象的年龄: "+p1.getAge());
			System.out.println("读取序列化对象的成绩: "+p1.getScore());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
