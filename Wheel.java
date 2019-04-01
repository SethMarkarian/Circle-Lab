public class Wheel extends Circle
{
    private double numTurns;
    
    public Wheel(double r) {
        super(r);
        numTurns = 0.0;
    }
    
    public void turn(double n) {
        numTurns += n;
    }
    
    public double getDistance() {
        return this.getPerimeter() * numTurns;
    }
}
