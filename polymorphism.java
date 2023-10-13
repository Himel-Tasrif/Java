// Tasrif Nur Himel

/*
  
                                        *** Polymorphism ***
 */

class Shape{
    double area(){
        return 0;
    }
}

class Rectangle extends Shape{

    double length, width;

    Rectangle(double length, double width){
        this.length = length;
        this.width = width;

    }
    @Override
    double area(){
        return length*width;
    }
}

class Triangle extends Shape{

    double base, height;

    Triangle(double base, double height){
        this.base = base;
        this.height = height;

    }
    @Override
    double area(){
        return 0.5*base*height;
    }
}

 public class polymorphism {
    public static void main(String[] args) {

        //this is as usual 
      /* Shape s = new Shape();
       Rectangle r = new Rectangle(10,20);
       Triangle t = new Triangle(10,20); */

       //for polymorphism:

        Shape s1 = new Shape();
        Shape s2 = new Rectangle(10,20);
        Shape s3 = new Triangle(10,20);

       System.out.println("Area of Shape: "+s1.area());
       System.out.println("Area of Rectangle: "+s2.area());
       System.out.println("Area of Triangle: "+s3.area());
    }
}
