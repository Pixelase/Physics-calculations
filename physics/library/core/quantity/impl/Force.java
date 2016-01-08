package physics.library.core.quantity.impl;

import physics.library.core.quantity.Quantity;
import physics.library.core.quantity.unit.Unit;

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
        value = m.getValue() * a.getValue();
    }

    public void compute(double coefficient, Force n) {
        value = coefficient * n.getValue();
    }

    public void compute(Work a, Distance d, double degree) {
        value = a.getValue() / d.getValue() * Math.cos(degree);
    }

}
