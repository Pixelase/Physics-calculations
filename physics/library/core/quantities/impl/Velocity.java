package physics.library.core.quantities.impl;

import physics.library.core.quantities.Quantity;
import physics.library.core.quantities.Unit;

public class Velocity extends Quantity {

    public Velocity() {
        // TODO Auto-generated constructor stub
    }

    public Velocity(double value) {
        super(value);
        // TODO Auto-generated constructor stub
    }

    public Velocity(double value, Unit unit) {
        super(value, unit);
        // TODO Auto-generated constructor stub
    }

    public void compute(Velocity v0, Acceleration a, Time t) {
        value = v0.getValue() + a.getValue() * t.getValue();
    }

    public void compute(Velocity v0, Acceleration a, Distance d) {
        value = Math.sqrt(Math.pow(v0.getValue(), 2) + 2 * a.getValue()
                * d.getValue());
    }

    public void compute(Velocity v0, Distance d, Time t) {
        value = 2 * d.getValue() / t.getValue() - v0.getValue();
    }

    public void compute(Acceleration a, Radius r) {
        value = Math.sqrt(a.getValue() * r.getValue());
    }

    public void compute(Pulse p, Mass m) {
        value = p.getValue() / m.getValue();
    }
}
