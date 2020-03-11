package adapter.iterator;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * 将Iterator接口适配为Enumeration接口
 *
 * @author Su Jiulong
 * @date 2020/3/11 12:00
 */
public class IteratorAdapter implements Enumeration<Integer> {
	private Iterator<Integer> iterator;

	public IteratorAdapter(Iterator<Integer> iterator) {
		this.iterator = iterator;
	}

	@Override
	public boolean hasMoreElements() {
		return iterator.hasNext();
	}

	@Override
	public Integer nextElement() {
		return iterator.next();
	}
}
