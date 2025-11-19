package ro.academyplus.avaj.simulator.Factory;

import ro.academyplus.avaj.simulator.Coordinates;
import ro.academyplus.avaj.simulator.Flyable;
import ro.academyplus.avaj.simulator.Aircraft.Helicopter;

public class HelicopterAircraft extends AircraftFactory {
    @Override
    public Flyable create(long p_id, String p_name, Coordinates p_coordinates) {
        return new Helicopter(p_id, p_name, p_coordinates);
    }
}
