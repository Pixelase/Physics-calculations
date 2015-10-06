package physics.library.core.quantities.impl;

import physics.library.core.quantities.Quantity;
import physics.library.core.quantities.Unit;

public class Velocity extends Quantity {

	public Velocity() {
		// TODO Auto-generated constructor stub
	}

	public Velocity(double value) {
		super(value);
		// TODO Auto-generated constructor stub
	}

	public Velocity(double value, Unit unit) {
		super(value, unit);
		// TODO Auto-generated constructor stub
	}
	
	public void compute(Velocity v0, Acceleration a, Time t) {
		value = v0.getValue() + a.getValue() * t.getValue();
	}

}
