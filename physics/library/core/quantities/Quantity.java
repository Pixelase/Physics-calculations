package physics.library.core.quantities;

public abstract class Quantity {
	protected double value;

	public Quantity() {
		value = 0.0;
	}

	public Quantity(double value) {
		this.value = value;
	}

	public Quantity(double value, Unit unit) {
		this.value = value * unit.getModifier();
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}
}
