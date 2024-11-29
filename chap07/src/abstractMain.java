abstract class Shape{
    int x, y;

    abstract void draw();
}

class Circle extends Shape{
    private double radius;
    Circle(double r){
        this.radius = r;
    }

    void draw(){
        System.out.println("원을 그림, 반지름 : "+radius);
    }
}

public class abstractMain {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        circle.draw();
    }
}
