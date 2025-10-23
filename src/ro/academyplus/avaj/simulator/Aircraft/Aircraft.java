/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   Aircraft.java                                      :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: mraineri <mraineri@student.42lisboa.com    +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2025/10/04 15:46:46 by mraineri          #+#    #+#             */
/*   Updated: 2025/10/23 19:22:25 by mraineri         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

package ro.academyplus.avaj.simulator.Aircraft;
import ro.academyplus.avaj.simulator.Coordinates;
import ro.academyplus.avaj.simulator.Flyable;

public class Aircraft extends Flyable {
    protected long id;
    protected String name; 
    protected Coordinates coordinates;
    
    protected Aircraft(long id, String name, Coordinates coordinates) {
        this.id = id;
        this.name = name;
        this.coordinates = coordinates;
    }
    
    public void updateCondiotions() {
        
    };
}