package Lab4Q4;

public class SimpleGeometricObject {
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;

    /**
     * Construct a default geometric object
     */
    public SimpleGeometricObject() {
        dateCreated = new java.util.Date();
    }

    /**
     * Construct a geometric object with the specified color
     * and filled value
     */
    public SimpleGeometricObject(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled; //colored & filled
    }

    /**
     * Get the color
     */
    public String getColor() {
        return color;
    }

    /**
     * Set a new color
     */
    public void setColor(String color) {
        this.color = color;
    }


    /**
     * If is filled. Since filled is boolean,
     * its get method is named isFilled
     */
    public boolean isFilled() {
        return filled;
    }

    /**
     * Set to filled
     */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /**
     * Get dateCreated
     */
    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    /**
     * Return a string representation of this object
     * Overriding the toString() method
     */
    public String toString() {
        return "created on " + dateCreated + "\ncolor: " + color +
                " and filled: " + filled;
    }
}
