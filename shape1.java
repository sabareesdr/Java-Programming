package HW;

abstract class shape
{
 int a=4,b=6;
 abstract public void print_area();
}
class rectangle extends shape
{
 public int area_rect;
       
 public void print_area()
 {
  area_rect=a*b;
  System.out.println("The area of rectangle is:"+area_rect);
 }

}
class triangle extends shape
{
 int area_tri;
       
 public void print_area()
 {
  area_tri=(int) (0.5*a*b);
  System.out.println("The area of triangle is:"+area_tri);
 }
}

class circle extends shape
{
 int area_circle;
       
 public void print_area()
 {
  area_circle=(int) (3.14*a*a);
  System.out.println("The area of circle is:"+area_circle);
 }
}
public class shape1 {

    public static void main(String[] args) {
       
        rectangle r=new rectangle();
        r.print_area();
        triangle t=new triangle();
        t.print_area();
        circle r1=new circle();
        r1.print_area();
  }
}


