package decorator.io;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 将读入的字符转换为小写
 *
 * @author Su Jiulong
 * @date 2020/3/8 12:04
 */
public class LowerCaseInputStream extends FilterInputStream {

	public LowerCaseInputStream(InputStream in) {
		super(in);
	}

	/**
	 * 针对字节读取
	 */
	@Override
	public int read() throws IOException {
		int c = super.read();
		return (c == -1 ? c : Character.toLowerCase((char) c));
	}

	/**
	 * 针对字节数组读取
	 */
	@Override
	public int read(byte[] b, int offset, int len) throws IOException {
		int result = super.read(b, offset, len);
		for (int i = offset; i < offset + result; i++) {
			b[i] = (byte) Character.toLowerCase((char) b[i]);
		}
		return result;
	}
}
