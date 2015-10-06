package physics.library.core.quantities.impl;

import physics.library.core.quantities.Quantity;
import physics.library.core.quantities.Unit;

public class Radius extends Quantity {

	public Radius() {
		// TODO Auto-generated constructor stub
	}

	public Radius(double value) {
		super(value);
		// TODO Auto-generated constructor stub
	}

	public Radius(double value, Unit unit) {
		super(value, unit);
		// TODO Auto-generated constructor stub
	}

	public void compute(Velocity v, Acceleration a) {
		value = Math.pow(v.getValue(), 2) / a.getValue();
	}

}
