class Triangle extends Figure {

    private int a, b, c;

    public Triangle(Point p, int a, int b, int c){
        super(p);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double perimetr() {
        return a + b + c;
    }

    @Override
    public double area() {
        int p;
        p = (a+b+c)/2;
        return Math.sqrt(p*(p - a)*(p - b)*(p - c));
    }

    @Override
    public void draw(){
        draw(Color.BLACK);
    }

    @Override
    public void draw(Color color){
        System.out.printf("Треугольник с координой %s c cторонами a:%s b:%s c:%s цвета %s%n", point, a, b, c, color);
    }


}
