/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   Flyable.java                                       :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: mraineri <mraineri@student.42lisboa.com    +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2025/10/04 15:46:27 by mraineri          #+#    #+#             */
/*   Updated: 2025/10/09 21:15:53 by mraineri         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

package ro.academyplus.avaj.simulator;

import ro.academyplus.avaj.simulator.Weater.WeatherTower;

public abstract class Flyable {
    protected WeatherTower weatherTower;

    public void registerTower(WeatherTower p_tower) {
        //
    }
    public abstract void updateCondiotions();
}