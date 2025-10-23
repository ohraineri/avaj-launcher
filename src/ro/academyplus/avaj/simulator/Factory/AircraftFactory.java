/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   AircraftFactory.java                               :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: mraineri <mraineri@student.42lisboa.com    +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2025/10/04 15:46:40 by mraineri          #+#    #+#             */
/*   Updated: 2025/10/23 19:21:27 by mraineri         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

package ro.academyplus.avaj.simulator.Factory;

import ro.academyplus.avaj.simulator.Flyable;
import ro.academyplus.avaj.simulator.Coordinates;

abstract class AircraftFactory {
    protected abstract Flyable createAircraft(long id, String name, Coordinates coordinates);
}