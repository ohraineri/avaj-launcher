/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   Tower.java                                         :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: mraineri <mraineri@student.42lisboa.com    +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2025/10/04 15:46:37 by mraineri          #+#    #+#             */
/*   Updated: 2025/11/18 22:08:07 by mraineri         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

package ro.academyplus.avaj.simulator.Weather;

import java.util.ArrayList;
import java.util.List;
import ro.academyplus.avaj.simulator.Flyable;


public class Tower {
    private List<Flyable> observers = new ArrayList<Flyable>();

    public void register(Flyable p_flyable) {
        this.observers.add(p_flyable);
    }

    public void unregister(Flyable p_flyable) {
        this.observers.remove(p_flyable);
    }
    
    protected void conditionChanged() {
        //
    }
}