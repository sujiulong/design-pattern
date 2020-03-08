package decorator.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * I/O就是典型的装饰者模式
 *
 * @author Su Jiulong
 * @date 2020/3/8 12:04
 */
public class InputTest {
	public static void main(String[] args) throws IOException {
		int c;
		try (InputStream in =
				     new LowerCaseInputStream(
						     new BufferedInputStream(
								     new FileInputStream("src/decorator/io/test.txt")))) {
			while ((c = in.read()) >= 0) {
				System.out.print((char) c);
			}
		}
	}
}
