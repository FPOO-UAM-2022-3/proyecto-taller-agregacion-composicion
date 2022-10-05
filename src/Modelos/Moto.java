/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author pipet
 */
public class Moto extends Vehiculo{
    private int numeroPatas;

    public Moto(String placa, String marca, int año, String color, double avaluo,int numeroPatas) {
        super(placa, marca, año, color, avaluo);
        this.numeroPatas = numeroPatas;
    }

    /**
     * @return the numeroPatas
     */
    public int getNumeroPatas() {
        return numeroPatas;
    }

    /**
     * @param numeroPatas the numeroPatas to set
     */
    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }
    
}
