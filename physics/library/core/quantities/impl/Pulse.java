package physics.library.core.quantities.impl;

import physics.library.core.quantities.Quantity;
import physics.library.core.quantities.Unit;

public class Pulse extends Quantity {

	public Pulse() {
		// TODO Auto-generated constructor stub
	}

	public Pulse(double value) {
		super(value);
		// TODO Auto-generated constructor stub
	}

	public Pulse(double value, Unit unit) {
		super(value, unit);
		// TODO Auto-generated constructor stub
	}

	public void compute(Mass m, Velocity v) {
		value = m.getValue() + v.getValue();
	}

}
