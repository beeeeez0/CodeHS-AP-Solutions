public class Rectangle
{
    private int width;
    private int length;

    /**
     * This is the constructor to create a Rectangle.
     * To create a Rectangle we need to know its width
     * and length.
     */
    public Rectangle(int rectWidth, int rectLength)
    {
        width = rectWidth;
        length = rectLength;
    }


    // Put your methods here

    public int getLength() {
        return length;
    }

    public void setLength(int newLength) {
        length = newLength;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int newWidth) {
        width = newWidth;
    }

    public int getArea() {
        return (length*width);
    }

    public int getPerimeter() {
        return ((2*length)+(2*width));
    }


    /**
     * This method computes and prints the
     * area of the Rectangle.
     * Note it will print the area of the
     * Rectangle object that called it using
     * the dot operator!
     */
    public void printArea()
    {
        int area = width * length;
        System.out.println(area);
    }

    /**
     * This method computes and prints the
     * perimeter of the Rectangle.
     */
    public void printPerimeter()
    {
        int perimeter = 2 * width + 2 * length;
        System.out.println(perimeter);
    }

    /**
     * This is the toString method. It returns a String
     * representation of the object.
     */
    public String toString()
    {
        return "Rectangle width: " + width + ", Rectangle length: " + length;
    }
}