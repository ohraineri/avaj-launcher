package ro.academyplus.avaj.simulator.Aircraft;


import java.util.Map;

import ro.academyplus.avaj.simulator.Flyable;

import java.lang.Error;
import java.util.HashMap;

public class AircraftMultiton {
    private static Map<Long, Flyable> instances = new HashMap<>();

    static public Flyable registerAircraft(Flyable aircraft) {
        if(instances.containsKey(aircraft.getID())) {
            synchronized (AircraftMultiton.class) {
                if(instances.containsKey(aircraft.getID())) {
                    throw new Error("ID conflict: There was an attempt to add two aircraft with the same ID.");
                }
            }
        }
        return instances.put(aircraft.getID(), aircraft);
    }

    static public Flyable getAircraft(Long p_id) {
        if(!instances.containsKey(p_id)) {
            return null;
        }
        return instances.get(p_id);
    }

    static public int instancesSize() {
        return instances.size();
    }
}
