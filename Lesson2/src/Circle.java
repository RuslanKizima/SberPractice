public class Circle {

    private int radius;
    private String color;
    private double pi = 3.14;

    Circle(int radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public double area(){
        return (pi * radius * radius);
    }

    public double perimetr(){
        return (2 * pi * radius);
    }

    public void toStrings(){
        System.out.println("radius: " + this.radius);
        System.out.println("color: " + this.color);
        System.out.println("area: " + area());
        System.out.println("perimetr: " + perimetr());
    }

}
