/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Modelos.Carro;
import Modelos.Moto;
import Modelos.Taller;
import Modelos.Vehiculo;

/**
 *
 * @author pipet
 */
public class EjercicioTaller {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Carro c1=new Carro("abc123", "audi", 2022, "Negro", 1000, "mecanica");
        Moto m1=new Moto("AWE12", "Yamaha", 2020, "Blanca",500, 2);
        if (m1 instanceof Vehiculo) {
            System.out.println("Si es instancia");
        }else{
            System.out.println("NO es instancia");
        }
    }
    
}
