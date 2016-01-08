package physics.library.core.quantity.impl;

import physics.library.core.quantity.Quantity;
import physics.library.core.quantity.unit.Unit;

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
