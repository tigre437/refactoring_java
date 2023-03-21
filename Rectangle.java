
public class Rectangle {
    private double height;
    private double width;

    public Rectangle(double height, double width){
        this.height = height;
        this.width = width;
    }

    public double area(){
        double area = height * width;
        return area; //quitar variable area y poner todo en una linea
    }
}


class Square{
    private Rectangle rectangle;

    public Square(double a){
        this.rectangle = new Rectangle(a, a);
    }
    // source actions --> generate delegate methods, generate hashcode/to string, ...
    
}
