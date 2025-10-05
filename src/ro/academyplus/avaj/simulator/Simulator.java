/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   Simulator.java                                     :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: mraineri <mraineri@student.42lisboa.com    +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2025/10/04 15:46:38 by mraineri          #+#    #+#             */
/*   Updated: 2025/10/05 00:59:04 by mraineri         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

package ro.academyplus.avaj.simulator;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Simulator {
    public static void main(String[] args) {
        File scenario = new File(args[0]);
        System.out.println("Path: " + args[0]);

        try(Scanner scenarioFile = new Scanner(scenario)) {
            while (scenarioFile.hasNextLine()) {
                System.out.println(scenarioFile.nextLine() + "|");
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
        }
    }
}