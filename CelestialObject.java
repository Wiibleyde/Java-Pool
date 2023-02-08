import java.util.Locale;

public class CelestialObject {
    public double x;
    public double y;
    public double z;
    public String name;
    public static Integer KM_IN_ONE_AU = 150000000;
    public int mass;

    public CelestialObject() {
        this.x = 0.0;
        this.y = 0.0;
        this.z = 0.0;
        this.name = "Soleil";
        this.mass = 1;
    }
    
    public CelestialObject(String name, double x, double y, double z, int mass) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.name = name;
        this.mass = mass;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public double getZ() {
        return this.z;
    }

    public String getName() {
        return this.name;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMass() {
        return this.mass;
    }

    public static double getDistanceBetween(CelestialObject a, CelestialObject b) {
        double x = a.getX() - b.getX();
        double y = a.getY() - b.getY();
        double z = a.getZ() - b.getZ();
        return Math.sqrt(x*x + y*y + z*z);
    }

    public static double getDistanceBetweenInKm(CelestialObject a, CelestialObject b) {
        return getDistanceBetween(a, b) * KM_IN_ONE_AU;
    }

    @Override
    public String toString() {
        // return String.format("%s is positioned at (%f, %f, %f)", this.name, this.x, this.y, this.z);
        return this.name + " is positioned at (" + String.format(Locale.US, "%.3f", this.x) + ", " + String.format(Locale.US, "%.3f", this.y) + ", " + String.format(Locale.US, "%.3f", this.z) + ")";
    }

    @Override
    public int hashCode() {
        int hash = 1;
        hash = hash * 10 + name.hashCode();
        hash = hash * 5 +  (int) (x*1000.0);
        hash = hash * 14 + (int) (y*1000.0);
        hash = hash * 23 + (int) (z*1000.0);
        return hash;
    }

    @Override
    public boolean equals(Object b) {
        return (b instanceof CelestialObject) && this.hashCode() == b.hashCode();
    }
}
