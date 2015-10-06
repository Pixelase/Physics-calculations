package physics.library.core.quantities.impl;

import physics.library.core.quantities.Quantity;
import physics.library.core.quantities.Unit;

public class Distance extends Quantity {

	public Distance() {
		// TODO Auto-generated constructor stub
	}

	public Distance(double value) {
		super(value);
		// TODO Auto-generated constructor stub
	}

	public Distance(double value, Unit unit) {
		super(value, unit);
		// TODO Auto-generated constructor stub
	}

	public void compute(Velocity v, Velocity v0, Time t) {
		value = (v.getValue() + v0.getValue()) * t.getValue() / 2;
	}
	
	public void compute(Velocity v, Velocity v0, Acceleration a) {
		value = (Math.pow(v.getValue(), 2) - Math.pow(v0.getValue(), 2)) / (2 * a.getValue());
	}
	
	public void compute(Distance x0, Velocity v0, Time t, Acceleration a) {
		value = x0.getValue() + v0.getValue() * t.getValue() + (a.getValue() * Math.pow(t.getValue(), 2))/2;
	}
}
