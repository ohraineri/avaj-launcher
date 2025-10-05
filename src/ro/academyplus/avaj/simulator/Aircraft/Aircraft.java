/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   Aircraft.java                                      :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: mraineri <mraineri@student.42lisboa.com    +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2025/10/04 15:46:46 by mraineri          #+#    #+#             */
/*   Updated: 2025/10/05 00:18:34 by mraineri         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

import src.ro.academyplus.avaj.simulator.Coordinates;

class Aircraft {
    private long id;
    private String name;
    private Coordinates coordinates;
    
    private Aircraft(long id, String name, Coordinates coordinates) {
        this.id = id;
        this.name = name;
        this.coordinates = coordinates;
    }
}