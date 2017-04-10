package page237;

import java.io.ObjectInputStream;
import java.io.FileInputStream;

public class MyObjectInputStream {
	public static void main(String[] args) {
		try {
			ObjectInputStream f = new ObjectInputStream(
					new FileInputStream("object.dat"));
			Student s = (Student)(f.readObject());
			s.output();
			f.close();
		} catch (Exception e) { //��object.dat�ļ��еĸ�ʽ������Student�࣬�ͻ��׳��쳣
			System.err.println("��������" + e);
			e.printStackTrace();
		}

	}
}