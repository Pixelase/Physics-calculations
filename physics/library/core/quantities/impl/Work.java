package physics.library.core.quantities.impl;

import physics.library.core.quantities.Quantity;
import physics.library.core.quantities.Unit;

public class Work extends Quantity {

	public Work() {
		// TODO Auto-generated constructor stub
	}

	public Work(double value) {
		super(value);
		// TODO Auto-generated constructor stub
	}

	public Work(double value, Unit unit) {
		super(value, unit);
		// TODO Auto-generated constructor stub
	}

	public void compute(Force f, Distance s, double degree) {
		value = f.getValue() * s.getValue() * Math.cos(degree);
	}

}
