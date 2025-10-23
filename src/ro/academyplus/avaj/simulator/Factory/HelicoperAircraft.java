package ro.academyplus.avaj.simulator.Factory;

import ro.academyplus.avaj.simulator.Coordinates;
import ro.academyplus.avaj.simulator.Flyable;
import ro.academyplus.avaj.simulator.Aircraft.Helicoper;

public class HelicoperAircraft extends AircraftFactory {
    @Override
    public Flyable createAircraft(long id, String name, Coordinates coordinates) {
        return new Helicoper(id, name, coordinates);
    }
}
