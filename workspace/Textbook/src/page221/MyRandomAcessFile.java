package page221;

import java.io.IOException;
import java.io.RandomAccessFile;

public class MyRandomAcessFile {
	public static void main(String[] args) {
		try {
			RandomAccessFile f = new RandomAccessFile("text.txt", "rw");
			int i;
			double d;
			for (i = 0; i < 10; ++i) {
				f.writeDouble(Math.PI * i);
			}
			f.seek(16);
			f.writeDouble(0);
			f.seek(0);
			for (i = 0; i < 10; ++i) {
				d = f.readDouble();
				System.out.println("[" + i + "]:" + d);
			}
			f.close();
		} catch (IOException e) {
			System.out.println("��������" + e);
			e.printStackTrace();
		}
	}
}
