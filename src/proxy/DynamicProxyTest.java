package proxy;

/**
 * 代理模式：为另一个对象提供一个替身或占位符以控制对这个对象的访问。
 * 远程代理（RMI）：控制访问远程对象
 * 虚拟代理：控制访问创建开销大的资源
 * 保护代理：基于权限控制对资源的访问
 * <p>
 * 动态代理：动态体现在运行时创建代理对象
 * 代理模式强调使用代理控制对被代理对象的访问。
 * 装饰者强调动态给目标对象增加职责
 *
 * @author Su Jiulong
 * @date 2020/3/17 10:11
 */
public class DynamicProxyTest {
	public static void main(String[] args) {
		PersonBean personBean = new PersonBeanImpl();
		personBean.setAge(24);
		personBean.setHeight(178);
		personBean.setName("brady");
		System.out.println(personBean);
		System.out.println("---------------------------------------------");

		//非自己用户
		NonOwnerInvocationHandler nonOwnerInvocationHandler = new NonOwnerInvocationHandler(personBean);
		PersonBean personBenProxy = PersonBeanDynamicProxy.getPersonBenProxy(personBean, nonOwnerInvocationHandler);
		personBenProxy.setScore(90);
		try {
			personBenProxy.setName("abc");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(personBean);

		System.out.println("---------------------------------------------");
		//自己用户
		OwnerInvocationHandler ownerInvocationHandler = new OwnerInvocationHandler(personBean);
		PersonBean personBenProxy1 = PersonBeanDynamicProxy.getPersonBenProxy(personBean, ownerInvocationHandler);
		personBenProxy1.setName("1234");
		try {
			personBenProxy1.setScore(10);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(personBenProxy1);
	}
}
