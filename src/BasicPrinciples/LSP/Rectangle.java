package BasicPrinciples.LSP;

public class Rectangle implements Shape {
    private int width;
    private int height;

    public Rectangle(int width, int height){
        this.height = height;
        this.width = width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public long area() {
        return height*width;
    }
}
