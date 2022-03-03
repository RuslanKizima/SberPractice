class Square extends Figure {

    private int a;

    public Square(Point p, int a){
        super(p);
        this.a = a;
    }

    @Override
    public double perimetr() {
        return 2*(a + a);
    }

    @Override
    public double area() {
        return a*a;
    }

    @Override
    public void draw(){
        draw(Color.BLACK);
    }

    @Override
    public void draw(Color color){
        System.out.printf("Квадрат с координой %s со стороной %s цвета %s%n", point, a, color);
    }


}
