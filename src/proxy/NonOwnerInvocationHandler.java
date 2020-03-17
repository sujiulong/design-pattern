package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Objects;

/**
 * 非自己用户处理器
 *
 * @author Su Jiulong
 * @date 2020/3/17 9:58
 */
public class NonOwnerInvocationHandler implements InvocationHandler {
	private PersonBean personBean;

	public NonOwnerInvocationHandler(PersonBean personBean) {
		this.personBean = personBean;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		boolean nonSetScoreMethod = method.getName().startsWith("set")
				&& !Objects.equals("setScore", method.getName());
		if (nonSetScoreMethod) {
			throw new IllegalAccessException("非自己用户只能更改评分");
		}
		return method.invoke(personBean, args);
	}
}
