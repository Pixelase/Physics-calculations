package physics.library.core.quantity.unit;

import physics.library.core.quantity.unit.prefix.Prefix;

public class Unit {
    protected double modifier;

    public Unit() {
        modifier = 1;
    }

    public Unit(double modifier) {
        this.modifier = modifier;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public double getModifier() {
        return modifier;
    }

    public void setModifier(double modifier) {
        this.modifier = modifier;
    }

    public static class Builder {
        private Prefix<?>[] upperPrefixes;
        private Prefix<?>[] lowerPrefixes;

        private Builder() {
            super();
        }

        public Builder setUpperPrefixes(Prefix<?>... upperPrefixes) {
            this.upperPrefixes = upperPrefixes;

            return this;
        }

        public Builder setLowerPrefixes(Prefix<?>... lowerPrefixes) {
            this.lowerPrefixes = lowerPrefixes;

            return this;
        }

        public Unit build() {
            double resultModifier = 1;

            if (upperPrefixes != null) {
                for (Prefix<?> prefix : upperPrefixes) {
                    resultModifier *= prefix.getValue().doubleValue();
                }
            }

            if (lowerPrefixes != null) {
                for (Prefix<?> prefix : lowerPrefixes) {
                    resultModifier /= prefix.getValue().doubleValue();
                }
            }

            return new Unit(resultModifier);
        }
    }

}
