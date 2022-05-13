package main.java.volume.domain;

public class Cube implements Shape {

    /**
     * {@inheritDoc}
     */
    @Override
    public String calculateVolume(final int n) {
        return String.valueOf(n * n * n);
    }
}
