/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   AircraftFactory.java                               :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: mraineri <mraineri@student.42lisboa.com    +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2025/10/04 15:46:40 by mraineri          #+#    #+#             */
/*   Updated: 2025/10/25 17:20:40 by mraineri         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

package ro.academyplus.avaj.simulator.Factory;

import ro.academyplus.avaj.simulator.Flyable;
import ro.academyplus.avaj.simulator.Coordinates;

public class AircraftFactory {
    public static Flyable newAircraft(String p_type, String p_name, Coordinates p_coordinates) {
        return AircraftFactoryRegistry.create(p_type, p_name, p_coordinates);
    }
}