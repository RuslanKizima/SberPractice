public class FigureUtil {

    private FigureUtil(){
    }

    public static double area(Figure figure){
        return  figure.area();
    }

    public static double perimetr(Figure figure){
        return figure.perimetr();
    }

    public static void draw(Figure figure){
        figure.draw();
    }

    public static void draw(Figure figure, Color color){
        figure.draw();
    }

}
