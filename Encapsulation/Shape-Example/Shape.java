public class Rectangle {
    public int width;
    public int height;
}


Rectangle rect = new Rectangle();
rect.width = -1;
rect.height = -1;

public class Rectangle {
    private int width;
    private int height;

    public void setHeight(int value) {
        if(value <= 0) throw new IllegalArgumentException();
        height = value;
    }
    public int getHeight() {
        return height;
    }
}


Rectangle rect = new Rectangle();
rect.setHeight(-1) ; //IllegalArgumentException!