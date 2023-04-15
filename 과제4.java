interface Shape {
    void redraw();
    double getArea();
}
 
class Circle implements Shape {
    private int radius;
    
    public Circle(int radius) {
        this.radius = radius;
    }
    
    public void redraw() {
        System.out.println("--- 다시 그립니다. 반지름이 " + radius + "인 원입니다.");
    }
    
    public double getArea() {
        return 3.14 * radius * radius;
    }
}

    
class Oval implements Shape {
    private int width, height;
    
    public Oval(int width, int height) {
        this.width = width;
        this.height = height;
    }
    
    public void redraw() {
        System.out.println("--- 다시 그립니다. " + width + "X" + height + "에 내접하는 타원입니다.");
    }
    
    public double getArea() {
        return 3.14 * width * height;
    }
    
}

class Rect implements Shape {
    private int width, height;
    
    public Rect(int width, int height) {
        this.width = width;
        this.height = height;
    }
    
    public void redraw() {
        System.out.println("--- 다시 그립니다. " + width + "X" + height + "크기의 사각형 입니다.");
    }
    
    public double getArea() {
        return width * height;
    }
    
}

public class 과제4 {
    public static void main(String[] args) {
        Shape[] list = new Shape[3];
        list[0] = new Circle(10);
        list[1] = new Oval(20, 30);
        list[2] = new Rect(10, 40);
        
        for (int i = 0; i < list.length; i++) list[i].redraw();
        for (int i = 0; i < list.length; i++) System.out.println("면적은 " + list[i].getArea());
    }
}
