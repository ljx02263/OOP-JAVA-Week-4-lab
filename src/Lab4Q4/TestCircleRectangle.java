package Lab4Q4;

public class TestCircleRectangle {
    public static void main(String[] args) {
        CircleFromSimpleGeometricObject circle =
                new CircleFromSimpleGeometricObject(1);
        System.out.println("A circle " + circle.toString()); //SimpleGeometricObject's toString();
        System.out.println("The color is " + circle.getColor()); //SimpleGeometricObject's getColor();
        System.out.println("The radius is " + circle.getRadius());
        System.out.println("The area is " + circle.getArea());
        System.out.println("The diameter is " + circle.getDiameter());

        RectangleFromSimpleGeometricObject rectangle =
                new RectangleFromSimpleGeometricObject(2, 4);
        System.out.println("\nA rectangle " + rectangle.toString()); //SimpleGeometricObject's toString();
        System.out.println("The area is " + rectangle.getArea());
        System.out.println("The perimeter is " +
                rectangle.getPerimeter());
    }
}