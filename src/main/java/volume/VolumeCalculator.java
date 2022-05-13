package main.java.volume;

import java.util.Scanner;
import main.java.volume.domain.Cube;
import main.java.volume.domain.Shape;
import main.java.volume.domain.Sphere;
import main.java.volume.domain.Tetrahedron;

public class VolumeCalculator {

    private static final String CUBE = "cube";
    private static final String SPHERE = "sphere";
    private static final String TETRAHEDRON = "tetrahedron";
    private static final String EXIT = "exit";

    public static void main(String[] args) {
        String userShape;
        do {
            System.out.println("Enter Shape (sphere, cube or tetrahedron) or enter exit: ");
            final Scanner input = new Scanner(System.in);
            userShape = input.nextLine();

            switch (userShape) {
                case EXIT:
                    return;
                case SPHERE:
                    printVolumeOfSphere();
                    break;
                case CUBE:
                    printVolumeOfCube();
                    break;
                case TETRAHEDRON:
                    printVolumeOfTetrahedron();
                    break;
                default:
                    System.out.println("No value entered.");
            }

            System.out.println();
        } while (!userShape.isBlank());
    }

    /**
     * Calculate and print the volume of a Sphere
     */
    private static void printVolumeOfSphere() {
        final Shape sphere = new Sphere();
        System.out.print("Enter radius: ");
        try {
            final Scanner input = new Scanner(System.in);
            final int radius = Integer.parseInt(input.nextLine());
            System.out.print("Volume of sphere with radius of " + radius + " = " + sphere.calculateVolume(radius));
        } catch (final NumberFormatException e) {
            System.out.print("Radius entered is not a valid integer");
        }
    }

    /**
     * Calculate and print the volume of a Cube
     */
    private static void printVolumeOfCube() {
        final Shape cube = new Cube();
        System.out.print("Enter width: ");
        try {
            final Scanner input = new Scanner(System.in);
            final int width = Integer.parseInt(input.nextLine());
            System.out.print("Volume of cube with width of " + width + " = " + cube.calculateVolume(width));
        } catch (final NumberFormatException e) {
            System.out.print("Width entered is not a valid integer");
        }
    }

    /**
     * Calculate and print the volume of a tetrahedron
     */
    private static void printVolumeOfTetrahedron() {
        final Shape tetrahedron = new Tetrahedron();
        System.out.print("Enter edge size: ");
        try {
            final Scanner input = new Scanner(System.in);
            final int edgeSize = Integer.parseInt(input.nextLine());
            System.out.print(
                "Volume of tetrahedron with edge size of " + edgeSize + " = " + tetrahedron.calculateVolume(edgeSize));
        } catch (final NumberFormatException e) {
            System.out.print("Edge size entered is not a valid integer");
        }
    }
}
