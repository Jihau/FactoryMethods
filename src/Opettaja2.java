package factorymethod.src;

public class Opettaja2 extends AterioivaOtus {

	public Juoma createJuoma() {
		return new Mehu();
	}
}
