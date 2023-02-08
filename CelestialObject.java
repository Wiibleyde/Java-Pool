public class CelestialObject {
    public double x;
    public double y;
    public double z;
    public String name;
    public static Integer KM_IN_ONE_AU = 150000000;

    // public CelestialObject() {
    //     this.x = 0.0;
    //     this.y = 0.0;
    //     this.z = 0.0;
    //     this.name = "Soleil";
    // }
    
    // public CelestialObject(String name, double x, double y, double z) {
    //     this.x = x;
    //     this.y = y;
    //     this.z = z;
    //     this.name = name;
    // }

    // public double getX() {
    //     return this.x;
    // }

    // public double getY() {
    //     return this.y;
    // }

    // public double getZ() {
    //     return this.z;
    // }

    // public String getName() {
    //     return this.name;
    // }

    // public void setX(double x) {
    //     this.x = x;
    // }

    // public void setY(double y) {
    //     this.y = y;
    // }

    // public void setZ(double z) {
    //     this.z = z;
    // }

    // public void setName(String name) {
    //     this.name = name;
    // }

    // public static double getDistanceBetween(CelestialObject a, CelestialObject b) {
    //     double x = a.getX() - b.getX();
    //     double y = a.getY() - b.getY();
    //     double z = a.getZ() - b.getZ();
    //     return Math.sqrt(x*x + y*y + z*z);
    // }

    // public static double getDistanceBetweenInKm(CelestialObject a, CelestialObject b) {
    //     return getDistanceBetween(a, b) * KM_IN_ONE_AU;
    // }

    // public static String toString(CelestialObject a) {
    //     return a.getName() + " is positioned at (" + a.getX() + ", " + a.getY() + ", " + a.getZ() + ")";
    // }

    // public static boolean equals(CelestialObject a, CelestialObject b) {
    //     return a.getX() == b.getX() && a.getY() == b.getY() && a.getZ() == b.getZ() && a.getName().equals(b.getName());
    // }

    // public static int hashCode(CelestialObject a) {
    //     return (int) (a.getX() + a.getY() + a.getZ());
    // }

    // public String toString() {
    //     return toString(this);
    // }
}
