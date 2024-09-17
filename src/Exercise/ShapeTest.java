package Exercise;

class Shape {
    void display() {
        System.out.println("Let's make calculations on shapes\n\n");
    }
}

class Circle extends Shape {
    int radius;

    Circle(int radius) {
        this.radius = radius;
    }

 double circleArea() {
        return Math.PI * radius * radius;
    }

   double circlePerimeter() {
        return 2 * Math.PI * radius;
    }
}
class Rectangle extends Shape{
	int length;
	int width;
	
	Rectangle(int length,int width){
		this.length= length;
		this.width = width;	
	}
	
	int rectangleArea() {
		return length*width;
	}
	int rectanglePerimeter(){
		return 2*(length+width);
	}
}

public class ShapeTest {
    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        c1.display();
        
        Rectangle r1 = new Rectangle(5,3);
        
        double Circlearea = c1.circleArea();
        System.out.println("Area of the circle: " + Circlearea);
        
        double Circleperimeter = c1.circlePerimeter();
        System.out.println("\nPerimeter of the circle: " + Circleperimeter);
        
        int rectArea = r1.rectangleArea();
        System.out.println("\nArea of the rectangle is : " + rectArea);
        
        int rectPerimeter = r1.rectanglePerimeter();
        System.out.println("\nPerimeter of the rectangle is: " + rectPerimeter);
    }
}
