public class CartWheel extends Wheel
{
   private int numSpokes;
   
   public CartWheel(double r, int a) {
       super(r);
       numSpokes = a;
   }
   
   public double getArea() {
       return (this.getPerimeter() / Math.PI) * numSpokes;
   }
}
