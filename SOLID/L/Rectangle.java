package SOLID.L;

public class Rectangle {
    protected int width;
    protected int height;

    public Rectangle() {
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void getArea(){
        System.out.println("Area = "+ height*width);
    }
}
