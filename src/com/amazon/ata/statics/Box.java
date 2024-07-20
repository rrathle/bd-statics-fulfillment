package com.amazon.ata.statics;

public class Box {
    private static double height;
    private static double width;
    private static double length;

    private static final double MAX_DIMENSION = 72;


    /**
     * Constructs a Box object if the dimensions are valid
     * @param length - length of box
     * @param width - width of box
     * @param height - height of box
     * @throws DimensionValueException if the provided dimensions exceed the max Box size
     */
    public Box(double length, double width, double height) throws DimensionValueException {
        if(!validateBoxDimensions(height, width, length)) {
                throw new DimensionValueException("One of the dimensions height, width, or length exceeds 72 inches");
        }
        this.height = height;
        this.width = width;
        this.length = length;


    }

    public static boolean validateBoxDimensions(double height, double width, double length) {
        return height <= MAX_DIMENSION && width <= MAX_DIMENSION && length <= MAX_DIMENSION;
    }

    public static double getHeight() {
        return height;
    }

    public static double getWidth() {
        return width;
    }

    public static double getLength() {
        return length;
    }
}
