package physics.library.core.quantity.impl;

import physics.library.core.quantity.Quantity;
import physics.library.core.quantity.unit.Unit;

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
