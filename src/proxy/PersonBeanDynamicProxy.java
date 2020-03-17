package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * person bean 动态代理
 * 动态：体现在代理类是运行时创建的
 *
 * @author Su Jiulong
 * @date 2020/3/17 9:51
 */
public class PersonBeanDynamicProxy {
	public static PersonBean getPersonBenProxy(PersonBean bean, InvocationHandler handler) {
		return (PersonBean) Proxy.newProxyInstance(
				bean.getClass().getClassLoader(),
				bean.getClass().getInterfaces(),
				handler);
	}
}
