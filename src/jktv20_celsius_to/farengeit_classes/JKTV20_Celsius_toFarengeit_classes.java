/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jktv20_celsius_to.farengeit_classes;

import Celsius.Celsius;
import Farenheit.Farenheit;
import java.util.Scanner;
/**
 *
 * @author pupil
 */
public class JKTV20_Celsius_toFarengeit_classes {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Farenheit farenheit = new Farenheit();
        Celsius celsius = new Celsius();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите градус по цельсию: ");
        celsius.setCelsius(scanner.nextDouble()); 
        scanner.nextLine();
        double farenheitgradus = (9.0/5.0)*celsius.getCelsius()+32;
        System.out.println("Градус по фаренгейту будет таким: "+farenheitgradus);
        
    }
    
}
