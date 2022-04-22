public class Rectangle implements Shape{

    private int longSide;
    private int shortSide;

    public Rectangle(int longSide, int shortSide){
        this.longSide = longSide;
        this.shortSide = shortSide;
    }

    public int getLongSide() {
        return longSide;
    }

    public void setLongSide(int longSide) {
        this.longSide = longSide;
    }

    public int getShortSide() {
        return shortSide;
    }

    public void setShortSide(int shortSide) {
        this.shortSide = shortSide;
    }

    @Override
    public double computeArea() {
        return longSide*shortSide;
    }
}
