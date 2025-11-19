package ro.academyplus.avaj.simulator.Factory;

import ro.academyplus.avaj.simulator.Coordinates;
import ro.academyplus.avaj.simulator.Flyable;
import ro.academyplus.avaj.simulator.Aircraft.Baloon;

public class BaloonAircraft extends AircraftFactory {
    @Override
    public Flyable create(long p_id, String p_name, Coordinates p_coordinates) {
        return new Baloon(p_id, p_name, p_coordinates);
    }
}
