package physics.library.core.quantity.impl;

import physics.library.core.quantity.Quantity;
import physics.library.core.quantity.unit.Unit;

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
