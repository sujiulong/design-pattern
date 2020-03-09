package factory.abs;

/**
 * @author Su Jiulong
 * @date 2020/3/9 17:10
 */
public class CheapPartsFactoryImpl implements CarPartsFactory {
	@Override
	public Glass getGlass() {
		return new CheapGlassImpl();
	}

	@Override
	public Wheel getWheel() {
		return new CheapWheelImpl();
	}
}
