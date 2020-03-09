package factory.abs;

/**
 * @author Su Jiulong
 * @date 2020/3/9 17:16
 */
public class ExpensivePartsFactoryImpl implements CarPartsFactory {
	@Override
	public Glass getGlass() {
		return new ExpensiveGlassImpl();
	}

	@Override
	public Wheel getWheel() {
		return new ExpensiveWheelImpl();
	}
}
