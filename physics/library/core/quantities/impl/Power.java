package physics.library.core.quantities.impl;

import physics.library.core.quantities.Quantity;
import physics.library.core.quantities.Unit;

public class Power extends Quantity {

	public Power() {
		// TODO Auto-generated constructor stub
	}

	public Power(double value) {
		super(value);
		// TODO Auto-generated constructor stub
	}

	public Power(double value, Unit unit) {
		super(value, unit);
		// TODO Auto-generated constructor stub
	}
	
	public void compute(Work a, Time t) {
		value = a.getValue() / t.getValue();
	}
	
	public void compute(Force f, Velocity v) {
		value = f.getValue() * v.getValue();
	}

}
