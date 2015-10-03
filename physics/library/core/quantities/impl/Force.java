package physics.library.core.quantities.impl;

import physics.library.core.quantities.Quantity;
import physics.library.core.quantities.Unit;

public class Force extends Quantity {
	
	
	public Force() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Force(double value, Unit unit) {
		super(value, unit);
		// TODO Auto-generated constructor stub
	}

	public Force(double value) {
		super(value);
		// TODO Auto-generated constructor stub
	}

	public void compute(Mass m, Acceleration a) {
		value = m.getValue() *  a.getValue();
	}

}
