import java.util.Objects;

public class Planet extends CelestialObject {
    private Star centerStar;

    public Planet() {
        super();
        this.centerStar = new Star();
    }

    public Planet(String name, double x, double y, double z, Star centerStar) {
        super(name, x, y, z);
        this.centerStar = centerStar;
    }

    public Star getCenterStar() {
        return this.centerStar;
    }

    public void setCenterStar(Star centerStar) {
        this.centerStar = centerStar;
    }

    public double getDistanceFromCenterStar() {
        return CelestialObject.getDistanceBetween(this, this.getCenterStar());
    }

    @Override
    public String toString() {
        return String.format("%s orbits %s at a distance of %.3f AU", this.getName(), this.getCenterStar().getName(), this.getDistanceFromCenterStar());
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Planet)) {
            return false;
        }
        Planet planet = (Planet) o;
        return this.getName().equals(planet.getName()) && this.getX() == planet.getX() && this.getY() == planet.getY() && this.getZ() == planet.getZ() && this.getCenterStar().equals(planet.getCenterStar());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getX(), getY(), getZ(), getCenterStar());
    }


}
