package physics.library.core.quantities.impl;

import physics.library.core.quantities.Quantity;
import physics.library.core.quantities.Unit;

public class Acceleration extends Quantity {

	public Acceleration(double value, Unit unit) {
		super(value, unit);
		// TODO Auto-generated constructor stub
	}

	public Acceleration(double value) {
		super(value);
		// TODO Auto-generated constructor stub
	}

	public Acceleration() {
		// TODO Auto-generated constructor stub
	}

	public void compute(Force f, Mass m) {
		value = f.getValue() / m.getValue();
	}

	public void compute(Velocity v, Velocity v0, Time t) {
		value = (v.getValue() - v0.getValue()) / t.getValue();
	}
	
	public void compute(Velocity v, Radius r) {
		value = Math.pow(v.getValue(), 2) / r.getValue();
	}

}
