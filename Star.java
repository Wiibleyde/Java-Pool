public class Star {
    public CelestialObject celestialObject;
    private double magnitude;

    public Star() {
        this.celestialObject = new CelestialObject();
        this.magnitude = 0.0;
    }

    public Star(String name, double x, double y, double z, double magnitude) {
        this.celestialObject = new CelestialObject(name, x, y, z);
        this.magnitude = magnitude;
    }

    public double getX() {
        return this.celestialObject.getX();
    }

    public double getY() {
        return this.celestialObject.getY();
    }

    public double getZ() {
        return this.celestialObject.getZ();
    }

    public String getName() {
        return this.celestialObject.getName();
    }

    public double getMagnitude() {
        return this.magnitude;
    }

    public void setX(double x) {
        this.celestialObject.setX(x);
    }

    public void setY(double y) {
        this.celestialObject.setY(y);
    }

    public void setZ(double z) {
        this.celestialObject.setZ(z);
    }

    public void setName(String name) {
        this.celestialObject.setName(name);
    }

    public void setMagnitude(double magnitude) {
        this.magnitude = magnitude;
    }
}
