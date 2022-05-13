package main.java.volume.domain;

public class Tetrahedron implements Shape {

    /**
     * {@inheritDoc}
     */
    @Override
    public String calculateVolume(final int n) {
        final double volume = ((n * n * n) / (6 * Math.sqrt(2)));

        return String.format("%.2f", volume);
    }
}
