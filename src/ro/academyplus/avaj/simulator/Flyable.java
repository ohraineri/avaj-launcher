/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   Flyable.java                                       :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: mraineri <mraineri@student.42lisboa.com    +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2025/10/04 15:46:27 by mraineri          #+#    #+#             */
/*   Updated: 2025/10/25 12:05:45 by mraineri         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

package ro.academyplus.avaj.simulator;

import ro.academyplus.avaj.simulator.Weather.WeatherTower;

public abstract class Flyable {
    protected WeatherTower weatherTower;

    public void registerTower(WeatherTower p_tower) {
        //
    }
    public abstract void updateCondiotions();
}