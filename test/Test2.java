package com.aaa.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test2 {
	public static void main(String[] args) {
		Person2 p = new Person2("zhangsan", '��', 1980, 37);
		File f = new File("F:\\person2.txt");
		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// ��student�������л��Ĺ���
		try {
			ObjectOutputStream oo = new ObjectOutputStream(new FileOutputStream(f));
			oo.writeObject(p);
			oo.flush();
			oo.close();
			// ���ֽڷ����л�����
			ObjectInputStream oi = new ObjectInputStream(new FileInputStream(f));

			Person2 p1 = (Person2) oi.readObject();
			System.out.println("��ȡ���л����������: "+p1.getName());
			System.out.println("��ȡ���л�������Ա�: "+p1.getSex());
			System.out.println("��ȡ���л�����ĳ������: "+p1.getYear());
			System.out.println("��ȡ���л����������: "+p1.getAge());
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

