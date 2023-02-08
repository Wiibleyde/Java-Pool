import java.util.List;
import java.util.ArrayList;

public class Galaxy {
    private List<CelestialObject> celestialObjects;

    public Galaxy() {
        this.celestialObjects = new ArrayList<CelestialObject>();
    }

    public CelestialObject getCelestialObject(String name) {
        for (CelestialObject celestialObject : this.celestialObjects) {
            if (celestialObject.getName().equals(name)) {
                return celestialObject;
            }
        }
        return null;
    }

    public void addCelestialObject(CelestialObject celestialObject) {
        this.celestialObjects.add(celestialObject);
    }

    public void removeCelestialObject(CelestialObject celestialObject) {
        this.celestialObjects.remove(celestialObject);
    }

    public List<CelestialObject> getCelestialObjects() {
        return this.celestialObjects;
    }

    public void setCelestialObjects(List<CelestialObject> celestialObjects) {
        this.celestialObjects = celestialObjects;
    }
}
