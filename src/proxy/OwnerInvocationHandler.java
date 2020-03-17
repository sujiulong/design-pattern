package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 自己用户处理器
 *
 * @author Su Jiulong
 * @date 2020/3/17 9:52
 */
public class OwnerInvocationHandler implements InvocationHandler {
	private PersonBean personBean;

	public OwnerInvocationHandler(PersonBean personBean) {
		this.personBean = personBean;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		if ("setScore".equals(method.getName())) {
			throw new IllegalAccessException("自己不能修改评分");
		}
		return method.invoke(personBean, args);
	}
}
