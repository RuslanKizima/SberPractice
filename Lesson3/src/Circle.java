class Circle extends Figure {

    private int radius;

    public Circle(Point point, int radius){
        super(point);
        this.radius = radius;
    }

    @Override
    public double perimetr() {
        return 2*Math.PI*radius;
    }

    @Override
    public double area() {
        return Math.PI*radius*radius;
    }

    @Override
    public void draw(){
        draw(Color.BLACK);
    }

    @Override
    public void draw(Color color){
        System.out.printf("Круг с координой c %s радиусом %s цвета %s%n", point, radius, color);
    }


}
