package Lab4Q4;

public class PolymorphismDemo {
    /**
     * Main method
     */
    public static void main(String[] args) {

        // Created on (time). Color is red
        displayObject(new CircleFromSimpleGeometricObject
                (1, "red", false));

        //Created on (time). Color is black
        displayObject(new RectangleFromSimpleGeometricObject
                (1, 1, "black", true));

        //Not a SimpleGeometricObject, please try another one
        displayObject("good");
    }

    /**
     * Display geometric object properties
     */
    public static void displayObject(Object object) { //receive a reference of an object

        if (object instanceof SimpleGeometricObject){ //instance of ...

            //down casting and find the methods
            System.out.println("Created on " + ((SimpleGeometricObject)object).getDateCreated() +
                    ". Color is " + ((SimpleGeometricObject)object).getColor());
        }
        else {
            System.out.println("Not a SimpleGeometricObject, please try another one");
        }

    }
}