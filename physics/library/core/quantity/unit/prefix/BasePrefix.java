package physics.library.core.quantity.unit.prefix;

/**
 * Created by Alexander Babai on 08.01.2016.
 */
public enum BasePrefix implements Prefix<Double> {

    DEFAULT(1D), KILO(1000D), MEGA(1000000D), GIGA(1000000000D),
    MILI(0.001D), MICRO(0.000001D), NANO(0.000000001D);

    private final Double value;

    BasePrefix(Double value) {
        this.value = value;
    }

    public Double getValue() {
        return value;
    }
}
