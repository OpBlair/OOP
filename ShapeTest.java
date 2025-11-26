abstract class Shape{
    public abstract double calculateArea();
}

class Circle extends Shape{
    private double radius;
    Circle(double radius){
        this.radius = radius;
    }
    
    @Override
    public double calculateArea(){
        System.out.print("Area of circle = " );
        return Math.PI * this.radius * this.radius;
    }
}

class Rectangle extends Shape{
    private double width;
    private double height;
    
    Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    
    @Override
    public double calculateArea(){
        System.out.print("Area of rectangle = " );
        return width * height;
    }
}

class Triangle extends Shape{
    private double base;
    private double height;
    
    Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }
    
    @Override
    public double calculateArea(){
        System.out.print("Area of triangle = " );
        
        return 0.5 * base * height;
    }
}

public class ShapeTest{
    public static void main(String[] args) {
        Shape[] shapes = { new Circle(2), new Rectangle(10,20), new  Triangle(10,8)};
        for(Shape s: shapes){
            System.out.println(s.calculateArea());
        }
    }
}
