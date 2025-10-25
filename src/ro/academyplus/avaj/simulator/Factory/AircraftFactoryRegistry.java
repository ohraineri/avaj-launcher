package ro.academyplus.avaj.simulator.Factory;

import java.util.Map;
import java.util.HashMap;
import java.util.function.BiFunction;
import ro.academyplus.avaj.simulator.Flyable;
import ro.academyplus.avaj.simulator.Aircraft.AircraftMultiton;
import ro.academyplus.avaj.simulator.Aircraft.Baloon;
import ro.academyplus.avaj.simulator.Aircraft.Helicopter;
import ro.academyplus.avaj.simulator.Aircraft.JetPlane;
import ro.academyplus.avaj.simulator.Coordinates;

public class AircraftFactoryRegistry {
    private static final Map<String, Class<? extends Flyable>> registry = new HashMap<>();

    static {
        registry.put("Baloon", Baloon.class);
        registry.put("Helicopter", Helicopter.class);
        registry.put("JetPlane", JetPlane.class);
    }

    public static Flyable create(String p_type, String p_name, Coordinates p_coordinates) {
        Class<? extends Flyable> aircraftClass = registry.get(p_type);

        if(aircraftClass == null)
            throw new IllegalArgumentException("Unknown aircraft type: " + p_type);

        try {
            Flyable instance = aircraftClass.getConstructor(long.class, String.class, Coordinates.class).newInstance((AircraftMultiton.instancesSize() + 1), p_name, p_coordinates);
            AircraftMultiton.registerAircraft(instance);
            return instance;
        } catch(Exception e) {
            throw new RuntimeException("Failed to create aircraft: " + p_type, e);
        }
    }
}
