package physics.library.core.quantities.impl;

import physics.library.core.quantities.Quantity;
import physics.library.core.quantities.Unit;

public class Mass extends Quantity {

	public Mass() {
		// TODO Auto-generated constructor stub
	}

	public Mass(double value) {
		super(value);
		// TODO Auto-generated constructor stub
	}

	public Mass(double value, Unit unit) {
		super(value, unit);
		// TODO Auto-generated constructor stub
	}

	public void compute(Force f, Acceleration a) {
		value = f.getValue() / a.getValue();
	}
	
	public void compute(Pulse p, Velocity v) {
		value = p.getValue() / v.getValue();
	}

}
