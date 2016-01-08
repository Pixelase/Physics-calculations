package physics.library.core.quantity.unit.prefix;

/**
 * Created by Alexander Babai on 08.01.2016.
 */
public enum TimePrefix implements Prefix<Double> {
    SECONDS(1D), MINUTES(60D), HOURS(3600D);

    private final Double value;
    private BasePrefix basePrefix;

    TimePrefix(Double value) {
        this.value = value;
        basePrefix = BasePrefix.DEFAULT;
    }

    @Override
    public Double getValue() {
        return value * basePrefix.getValue();
    }

    public TimePrefix setBasePrefix(BasePrefix basePrefix) {
        this.basePrefix = basePrefix;
        return this;
    }

    public BasePrefix getBasePrefix() {
        return basePrefix;
    }
}
