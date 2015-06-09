public class Circle extends Shape 
{
   private int radius;

   Circle(int xcor, int ycor, int r) {
      super(xcor, ycor);
      setRadius(r);
   }

   public int getRadius() {
      return radius;
   }

   public void setRadius(int r) {
      radius = r;
   }  

   public void draw() {
      System.out.println("Drawing a circle at x: " + getX() + ", y: " + getY() +
                         " with radius of: " + getRadius());
   }
} 