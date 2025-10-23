package ro.academyplus.avaj.simulator.Factory;

import ro.academyplus.avaj.simulator.Coordinates;
import ro.academyplus.avaj.simulator.Flyable;
import ro.academyplus.avaj.simulator.Aircraft.Baloon;

public class BaloonAircraft extends AircraftFactory {
    @Override
    protected Flyable createAircraft(long id, String name, Coordinates coordinates) {
        return new Baloon(id, name, coordinates);
    }
    
}
