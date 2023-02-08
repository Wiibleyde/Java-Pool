import java.util.Objects;

public class Star extends CelestialObject {
    private double magnitude;
    
    public Star() {
        super();
        this.magnitude = 0.0;
    }
    
    public Star(String name, double x, double y, double z, double magnitude, int mass) {
        super(name, x, y, z, mass);
        this.magnitude = magnitude;
    }
    
    public double getMagnitude() {
        return this.magnitude;
    }
    
    public void setMagnitude(double magnitude) {
        this.magnitude = magnitude;
    }
    
    @Override
    public String toString() {
        return String.format("%s shines at the %.3f magnitude", this.getName(), this.getMagnitude());
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Star)) {
            return false;
        }
        Star star = (Star) o;
        return this.getName().equals(star.getName()) && this.getX() == star.getX() && this.getY() == star.getY() && this.getZ() == star.getZ() && this.getMagnitude() == star.getMagnitude();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getX(), getY(), getZ(), getMagnitude());
    }
}