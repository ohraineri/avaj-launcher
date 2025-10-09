/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   Flyable.java                                       :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: mraineri <mraineri@student.42lisboa.com    +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2025/10/04 15:46:27 by mraineri          #+#    #+#             */
/*   Updated: 2025/10/08 21:31:40 by mraineri         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

package ro.academyplus.avaj.simulator;

abstract class Flyable {
    protected WeatherTower weatherTower;

    public WeatherTower registerTower(WeatherTower p_tower) {
        // 
    }
    public abstract void updateCondiotions();
}