abstract class Shape{
    private String color;
    public abstract void draw();
    
    public void setColor(String color){
        this.color = color;
    }
    
    public String getColor(){
        return color;
    }
}

class Circle extends Shape{
    @Override
    public void draw(){
        System.out.println("Drawing circle.");
    }
}

class Rectangle extends Shape{
    @Override
    public void draw(){
        System.out.println("Drawing rectangle.");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("OOP concepts");
        Circle c1 = new Circle();
        c1.draw();
        c1.setColor("red");
        System.out.println(c1.getColor());
        Rectangle r1 = new Rectangle();
        r1.draw();


        Shape[] shapes = new Shape[3];
        Circle c1 = new Circle();
        c1.setColor("yellow");
        Rectangle r1 = new Rectangle();
        r1.setColor("blue");
        Triangle t1 = new Triangle();
        t1.setColor("red");
        
        shapes[0] = c1;
        shapes[1] = r1;
        shapes[2] = t1;
        
        for(Shape shape : shapes){
            System.out.println("Color: " + shape.getColor());
            shape.draw();
            System.out.println("- - - - - - - -");
        }
    }
}

//implementing composition in Java.
public class Main{
    public static void main(String[] args){
        System.out.println("Understanding Compositions in Java");
        
        Car c1 = new Car();
        c1.startCar();
    }
}

class Engine{
    void start(){ System.out.println("Engine started .... vroom"); }
    
    void stop(){ System.out.println("Engine stopped .... "); }
}

class Car{
    private Engine engine;
    
    public Car(){ engine = new Engine(); }
    
    public void startCar(){
        engine.start();
        System.out.println("Car's engine Started, car is now idling");
    }
    
    public void stopCar(){
        engine.stop();
        System.out.println("Car's engine stopped, car engine is off");
    }
}


//Smart Home system combining multiple OOP concepts, composition, abstraction, polymorphism
import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args){
        System.out.println("Smart Home System");
        System.out.println("-----------------------------------");
        SmartHome home = new SmartHome();
        home.addDevice(new Light("Living Room bulb"));
        home.addDevice(new Light("Bed Room fan"));
        home.addDevice(new Light("Kid's Room thermostat"));

        home.activateAll();
        home.deactivateAll();
    }
}

abstract class Device{
    private String name;
    private boolean isOn;
    
    public Device(String name){
        this.name = name;
        this.isOn = false;
    }
    
    public String getName(){ return name; }
    
    public boolean isOn(){ return isOn; }
    
    public void turnOn(){
        this.isOn = true;
        System.out.println(name + " is now ON.");
    }
    
    public void turnOff(){
        this.isOn = false;
        System.out.println(name + " is now OFF.");
    }
    
    public abstract void performFunction();
}

class Fan extends Device{
    public Fan(String name){super(name);}
    @Override
    public void performFunction(){
        if(isOn()){
            System.out.println(getName() + " is spinning.");
        }else{
            System.out.println(getName() + " is not spinning.");
        }
    }
} 

class Light extends Device{
    public Light(String name){super(name);}
    @Override
    public void performFunction(){
        if(isOn()){
            System.out.println(getName() + " is lighting.");
        }else{
            System.out.println(getName() + " is not lighting.");
        }
    }
}

class Thermostat extends Device{
    public Thermostat(String name){super(name);}
    @Override
    public void performFunction(){
        if(isOn()){
            System.out.println(getName() + " is recording temperature.");
        }else{
            System.out.println(getName() + " is not recording temperature.");
        }
    }
}

class SmartHome{
    public List<Device> devices = new ArrayList<>();
    
    public void addDevice(Device device){
        devices.add(device);
    }
    
    public void activateAll(){
        for(Device dev : devices){
            dev.turnOn();
            dev.performFunction();
            System.out.println("-----------------------------------");
        }
    }
    
    public void deactivateAll(){
        for(Device dev : devices){
            dev.turnOff();
        }
    }
}

