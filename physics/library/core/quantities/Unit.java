package physics.library.core.quantities;

public class Unit {
    protected double modifier;

    public Unit() {
        modifier = 1;
    }

    public Unit(double modifier) {
        this.modifier = modifier;
    }

    public double getModifier() {
        return modifier;
    }

}
