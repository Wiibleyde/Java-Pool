import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

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

    public Map<String, Integer> computeMassRepartition() {
        Map<String, Integer> massRepartition = new HashMap<>(Map.of("Other", 0, "Planet", 0, "Star", 0));
    
        for (CelestialObject celestialObject : this.celestialObjects) {
            if (celestialObject instanceof Planet) {
                massRepartition.put("Planet", massRepartition.get("Planet") + celestialObject.getMass());
            } else if (celestialObject instanceof Star) {
                massRepartition.put("Star", massRepartition.get("Star") + celestialObject.getMass());
            } else {
                massRepartition.put("Other", massRepartition.get("Other") + celestialObject.getMass());
            }
        }
    
        // Map<String, String> formattedMassRepartition = new HashMap<>();
        // for (Map.Entry<String, Double> entry : massRepartition.entrySet()) {
        //     double value = entry.getValue();
        //     formattedMassRepartition.put(entry.getKey(), value == (int) value ? Integer.toString((int) value) : Double.toString(value));
        // }
        return massRepartition;
    }
        
}
