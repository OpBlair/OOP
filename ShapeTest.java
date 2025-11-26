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
        //System.out.print("Area of circle = " );
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
        //System.out.print("Area of rectangle = " );
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
        //System.out.print("Area of triangle = " );
        
        return 0.5 * base * height;
    }
}

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = { new Circle(2), new Rectangle(10,20), new  Triangle(10,8)};
        /*
        for(Shape i: shapes){
            System.out.println(i.calculateArea());
        }*/
        //Alternative to above
        for(Shape s: shapes){
            if(s instanceof Circle c){
                System.out.printf("Area of cirlce = %.2f%n", s.calculateArea());
            }else if(s instanceof Rectangle r){
                System.out.printf("Area of rectangle = %.2f%n", s.calculateArea());
            }else if(s instanceof Triangle t){
                System.out.printf("Area of triangle = %.2f%n", s.calculateArea());
            }
        }
        
    }
}
