package physics.library.core.quantity.impl;

import physics.library.core.quantity.Quantity;
import physics.library.core.quantity.unit.Unit;

public class Time extends Quantity {

    public Time() {
        // TODO Auto-generated constructor stub
    }

    public Time(double value) {
        super(value);
        // TODO Auto-generated constructor stub
    }

    public Time(double value, Unit unit) {
        super(value, unit);
        // TODO Auto-generated constructor stub
    }

    public void compute(Velocity v, Velocity v0, Acceleration a) {
        value = (v.getValue() - v0.getValue()) / a.getValue();
    }

    public void compute(Velocity v, Velocity v0, Distance d) {
        value = 2 * d.getValue() / (v.getValue() + v0.getValue());
    }

    public void compute(Work a, Power p) {
        value = a.getValue() / p.getValue();
    }

}
