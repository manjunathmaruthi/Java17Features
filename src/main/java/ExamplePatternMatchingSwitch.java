public class ExamplePatternMatchingSwitch {

    public static void main(String[] args) {

        Shape shape = new Circle();
        switch (shape) {
            case Triangle triangle: System.out.println("triangle matched");break;
            case Circle circle: System.out.println("Circle matched");break;
            default: throw new IllegalStateException("Unexpected value: " + shape);
        }
    }
}

interface Shape {

}

class Triangle implements Shape {

    public void draw() {
        System.out.println("Shape");
    }
}

class Circle implements Shape{
    public void draw() {
        System.out.println("Circle");
    }
}
