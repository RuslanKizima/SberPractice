public abstract class Figure implements Drawable {

    protected Point point;


    public Figure(Point point) {
        this.point = point;
    }

    public abstract double perimetr();

    public abstract double area();

    public abstract void draw();

    public abstract void draw(Color color);

}