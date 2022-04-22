public class Main {

    /*

    You should be to substitute base class objects with child class objects and this should not alter
    behaviour-characteristics of the program

    Child class should not break method functionality of the methods that it override from the super class.
    For example setHeight() method sets high value, another setWidth() method sets width to a value.
    If user calls getHeight() method, it supposed to return the value that set with setHeight() method,
    if the outcome is not as expected than this may be Liskov Substitution violation.

     */

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(3423,23);
        System.out.println("Rectangle area : " +rectangle.computeArea());

        Square square1 = new Square(34);
        System.out.println("Square area : "+square1.computeArea());
    }

    private static void useRectangle(Rectangle rectangle) {
        rectangle.setLongSide(20);
        rectangle.setShortSide(30);
        // assert and if statement does the same job
        if (rectangle.getLongSide() != 20) throw new AssertionError("Height Not equal to 20");
        assert rectangle.getShortSide() == 30 : "Width Not equal to 30";
    }

}
