package physics.library.core.quantity.impl;

import physics.library.core.quantity.Quantity;
import physics.library.core.quantity.unit.Unit;

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
