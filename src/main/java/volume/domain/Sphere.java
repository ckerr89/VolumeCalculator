package main.java.volume.domain;

public class Sphere implements Shape {

    /**
     * {@inheritDoc}
     */
    @Override
    public String calculateVolume(final int n) {
        final double powerOfThree = n * n * n;
        final double volume = (4.0 / 3.0) * Math.PI * powerOfThree;

        return String.format("%.2f", volume);
    }
}
