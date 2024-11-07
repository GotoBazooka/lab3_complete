package org.example.creational.builder;

public class Car {
    private final String engine;
    private final String transmission;
    private final String interior;
    private final String color;
    private final boolean hasSunroof;
    private final boolean hasGPS;
    private final boolean hasSafetyPackage;

    private Car(Builder builder) {
        this.engine = builder.engine;
        this.transmission = builder.transmission;
        this.interior = builder.interior;
        this.color = builder.color;
        this.hasSunroof = builder.hasSunroof;
        this.hasGPS = builder.hasGPS;
        this.hasSafetyPackage = builder.hasSafetyPackage;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine='" + engine + '\'' +
                ", transmission='" + transmission + '\'' +
                ", interior='" + interior + '\'' +
                ", color='" + color + '\'' +
                ", hasSunroof=" + hasSunroof +
                ", hasGPS=" + hasGPS +
                ", hasSafetyPackage=" + hasSafetyPackage +
                '}';
    }

    public static class Builder {
        private String engine;
        private String transmission;
        private String interior;
        private String color;
        private boolean hasSunroof;
        private boolean hasGPS;
        private boolean hasSafetyPackage;

        public Builder setEngine(String engine) {
            this.engine = engine;
            return this;
        }

        public Builder setTransmission(String transmission) {
            this.transmission = transmission;
            return this;
        }

        public Builder
        setInterior(String interior) {
            this.interior = interior;
            return this;
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Builder setHasSunroof(boolean hasSunroof) {
            this.hasSunroof = hasSunroof;
            return this;
        }

        public Builder setHasGPS(boolean hasGPS) {
            this.hasGPS = hasGPS;
            return this;
        }

        public Builder setHasSafetyPackage(boolean hasSafetyPackage) {
            this.hasSafetyPackage = hasSafetyPackage;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}

