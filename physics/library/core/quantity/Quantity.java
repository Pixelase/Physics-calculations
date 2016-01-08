package physics.library.core.quantity;

import physics.library.core.quantity.unit.Unit;

public abstract class Quantity {
    protected double value;
    protected Unit unit;

    public Quantity() {
        value = 0.0;
        unit = new Unit();
    }

    public Quantity(double value) {
        this.value = value;
        unit = new Unit();
    }

    public Quantity(double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    public double getValue() {
        return value * unit.getModifier();
    }

    public void setValue(double value) {
        this.value = value;
    }

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }
}
