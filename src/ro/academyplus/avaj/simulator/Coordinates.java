/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   Coordinates.java                                   :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: mraineri <mraineri@student.42lisboa.com    +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2025/10/04 22:12:43 by mraineri          #+#    #+#             */
/*   Updated: 2025/10/05 00:10:58 by mraineri         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

package src.ro.academyplus.avaj.simulator;

public class Coordinates {
    private int longitude;
    private int latitude;
    private int height;
    
    protected Coordinates(int p_longitude, int p_latitude, int p_height) {
        this.longitude = p_longitude;
        this.latitude = p_latitude;
        this.height = p_height;
    }

    public int getLongitude() {
        return this.longitude;
    }

    public int getLatitude() {
        return this.latitude;
    }

    public int getHeight() {
        return this.height;
    }
}
