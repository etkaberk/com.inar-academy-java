package chapters.Chapter10.Exercises10;

public class MyRectangle2D {

    private double x;
    private double y;
    private double width;
    private double height;


    public MyRectangle2D() {
        this(0, 0, 1, 1);
    }

    public MyRectangle2D(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getArea() {
        return getHeight() * getWidth();
    }

    public double getPerimeter() {
        return 2 * (getWidth() + getHeight());
    }

    public boolean contains(double x, double y) {
        boolean xRange = ((x < (getX() + getWidth() / 2)) && (x > (getX() - getWidth() / 2)));

        boolean yRange = ((y < getY() + getHeight() / 2) && (y > getY() - getHeight() / 2));
        return xRange && yRange;

    }

    public boolean contains(MyRectangle2D r) {
        double[][] corner = new double[4][2];

        corner[0][0] = r.getX() - getWidth() / 2;
        corner[0][1] = r.getY() + getHeight() / 2;
        corner[1][0] = r.getX() + getWidth() / 2;
        corner[1][1] = r.getY() + getHeight() / 2;
        corner[2][0] = r.getX() - getWidth() / 2;
        corner[2][1] = r.getY() - getHeight() / 2;
        corner[3][0] = r.getX() + getWidth() / 2;
        corner[3][1] = r.getY() - getHeight() / 2;


        for (int i = 0; i < corner.length; i++) {
            if (!contains(corner[i][0], corner[i][1])) {
                return false;
            }
        }
        return true;
    }
public boolean overlaps(MyRectangle2D r ){
        if (((getY() + (getHeight() / 2 )) < r.getY() - (r.getHeight() / 2)) ||  (getY() - (getHeight() / 2) > r.getY() + (r.getHeight() / 2)) ||
                (getX() + (getWidth() / 2) < r.getX() - (r.getWidth() / 2)) ||
                (getX() - (getWidth() / 2)) > r.getX() + (r.getWidth() / 2)) {
            return false;

        }
return true;
    }


}