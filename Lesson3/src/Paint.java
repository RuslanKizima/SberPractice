public class Paint {


    public static void main(String[] args){
        Figure circle = new Circle(new Point(1, 5), 10);
        Figure rectangle = new Rectangle(new Point(1, 1), 10, 8);
        Figure square = new Square(new Point(0, 0), 7);
        Figure triangle = new Triangle(new Point(10, 10), 3, 4, 5);


        FigureUtil.draw(circle);
        FigureUtil.draw(circle, Color.RED);
        System.out.println("Площадь:" + circle.area());
        System.out.println("Периметр: " + circle.perimetr());
        FigureUtil.draw(rectangle);
        FigureUtil.draw(rectangle, Color.BLUE);
        System.out.println("Площадь:" + rectangle.area());
        System.out.println("Периметр: " + rectangle.perimetr());
        FigureUtil.draw(square);
        FigureUtil.draw(square, Color.WHITE);
        System.out.println("Площадь:" + square.area());
        System.out.println("Периметр: " + square.perimetr());
        FigureUtil.draw(triangle);
        FigureUtil.draw(triangle, Color.YELLOW);
        System.out.println("Площадь:" + triangle.area());
        System.out.println("Периметр: " + triangle.perimetr());
    }


}
