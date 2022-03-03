class Rectangle extends Figure {

    private int a, b;

    public Rectangle(Point p, int a, int b) {
        super(p);
        this.a = a;
        this.b = b;
    }

    @Override
    public double perimetr() {
        return 2*(a + b);
    }

    @Override
    public double area() {
        return a*b;
    }

    @Override
    public void draw(){
        draw(Color.BLACK);
    }

    @Override
    public void draw(Color color){
        System.out.printf("Прямоугольник с координой %s и шириной %s и c высотой %s цвета %s%n", point, a, b, color);
    }



}
