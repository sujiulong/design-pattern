package facade.kitchen;

/**
 * @author Su Jiulong
 * @date 2020/3/11 13:45
 */
public class KitchenFacade {
	private Hearth hearth;
	private KitchenVentilator kitchenVentilator;
	private Wok wok;

	public KitchenFacade(Hearth hearth, KitchenVentilator kitchenVentilator, Wok wok) {
		this.hearth = hearth;
		this.kitchenVentilator = kitchenVentilator;
		this.wok = wok;
	}

	public void cooking() {
		kitchenVentilator.on();
		hearth.on();
		wok.cooking();
		wok.toDish();
		hearth.off();
		kitchenVentilator.off();
	}

}
