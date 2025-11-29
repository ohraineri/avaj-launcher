/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   AircraftFactory.java                               :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: mraineri <mraineri@student.42lisboa.com    +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2025/10/04 15:46:40 by mraineri          #+#    #+#             */
/*   Updated: 2025/11/21 21:48:20 by mraineri         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

package ro.academyplus.avaj.simulator.Factory;

import ro.academyplus.avaj.simulator.Flyable;
import ro.academyplus.avaj.simulator.Coordinates;

public abstract class AircraftFactory {
    static long aircraft_id;
    
    public static Flyable newAircraft(String p_type, String p_name, Coordinates p_coordinates) {
        AircraftFactory aircraft;
        switch (p_type) {
            case "JetPlane":
                aircraft = new JetPlaneAircraft();
                break;
            case "Baloon":
                aircraft = new BaloonAircraft();
                break;
            case "Helicopter":
                aircraft = new HelicopterAircraft();
                break;        
            default:
                throw new Error("Invalid aircraft type");
        }        
        Flyable aircraftInstance = aircraft.create(++aircraft_id, p_name, p_coordinates);
        return aircraftInstance;
    }

    public abstract Flyable create(long p_id, String p_name, Coordinates p_coordinates);
}