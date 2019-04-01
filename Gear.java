public class Gear extends Wheel
{
    private int teeth;
    
    public Gear(double r, int t) {
        super(r);
        teeth = (int) t;
    }
    
    public double getPerimeter() {
        return super.getPerimeter() * 3;
    }
    
    public double getDistance() {
        return super.getDistance() * teeth;
    }
}
