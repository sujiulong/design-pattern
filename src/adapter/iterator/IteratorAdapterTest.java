package adapter.iterator;

import java.util.ArrayList;

/**
 * 将
 *
 * @author Su Jiulong
 * @date 2020/3/11 12:11
 */
public class IteratorAdapterTest {
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			arrayList.add(i);
		}
		IteratorAdapter iteratorAdapter = new IteratorAdapter(arrayList.iterator());
		while (iteratorAdapter.hasMoreElements()) {
			System.out.println(iteratorAdapter.nextElement());
		}
	}
}
