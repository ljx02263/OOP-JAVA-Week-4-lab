package Lab4Q4;

/**
 * Circle form Objects
 * Extends from the SimpleGeometricObjects
 */
public class CircleFromSimpleGeometricObject
        extends SimpleGeometricObject {

    private double radius; //new filed: radius
    // color,filled and date are inherited

    /**
     * Default constructor
     */
    public CircleFromSimpleGeometricObject() {
    }

    /**
     * Overriding constructor with radius
     */
    public CircleFromSimpleGeometricObject(double radius) {
        this.radius = radius;
    }

    /**
     * Overriding constructor with radius, color and fill.
     */
    public CircleFromSimpleGeometricObject(double radius,
                                           String color, boolean filled) {
        this.radius = radius;
        setColor(color); //inherited method from superclass
        setFilled(filled);
    }

    /**
     * Return radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Set a new radius
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Return area of a circle form object
     */
    public double getArea() {
        return radius * radius * Math.PI;
    }

    /**
     * Return diameter
     */
    public double getDiameter() {
        return 2 * radius;
    }

    /**
     * Return perimeter
     */
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    /* overridden method: Print the circle info */
    public void printCircle() {
        System.out.println("The circle is created " + getDateCreated() +
                " and the radius is " + radius);
    }
}