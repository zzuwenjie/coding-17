package page237;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class MyObjectOutputStream {
	public static void main(String[] args) {
		try {
			ObjectOutputStream f = new ObjectOutputStream(
					new FileOutputStream("object.dat")); //用来存储数据data
			Student s = new Student("张三", 20030012, 172);
			f.writeObject(s);
			s.output();
			f.close();
		} catch (Exception e) {
			System.err.println("发生错误" + e);
			e.printStackTrace();
		}
	}
}
