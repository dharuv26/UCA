interface print {
    public double area();
    public int numberOfSides();
    public void getName();
}

class circle implements print {
    private double radius;

    public circle(double r) {
        this.radius = r;
    }
    public double area() {
        return Math.PI * this.radius * this.radius;
    }
    public int numberOfSides() {
        return 0;
    }
    public void getName() {
        System.out.println("Circle");
    }
}

abstract class quadrilateral implements print{
    public int numberOfSides() {
        return 4;
    }
    public void getName() {
        System.out.println("Quadrilateral");
    }
    public abstract double area();
}

class rectangle extends quadrilateral{
    int length, breadth;
    public rectangle(int l, int b) {
        this.length = l;
        this.breadth = b;
    }
    public double area() {
        return length * breadth;
    }
    public void getName() {
        System.out.println("Rectangle");
    }
}

class square extends rectangle{
    public square(int l) {
        super(l, l);
    }
    public void getName() {
        System.out.println("Square");
    }
}

abstract class triangle implements print{
    public int numberOfSides() {
        return 3;
    }
    public void getName() {
        System.out.println("Triangle");
    }
    public abstract double area();
}

class equilateral extends triangle {
    int side;
    public equilateral(int s) {
        this.side = s;
    }
    public double area() {
        return side;
    }
    public void getName() {
        System.out.println("Equilateral Triangle");
    }
}

class scalene extends triangle {
    int a, b, c;
    public scalene(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double area() {
        return a + b + c;
    }
    public void getName() {
        System.out.println("Scalene Triangle");
    }
}

public class shape {
    
}
