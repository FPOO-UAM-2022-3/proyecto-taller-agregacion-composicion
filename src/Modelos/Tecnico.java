/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.util.LinkedList;

/**
 *
 * @author pipet
 */
public class Tecnico {
    private String cedula;
    private String nombre;
    private String telefono;
    private String especializacion;
    private int añosExperiencia;
    private LinkedList<Cubiculo> misCubiculos;
    LinkedList<Diagnostico> misDiagnosticos;
    public Tecnico(String cedula, String nombre, String telefono, String especializacion, int añosExperiencia) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.telefono = telefono;
        this.especializacion = especializacion;
        this.añosExperiencia = añosExperiencia;
        this.misCubiculos=new LinkedList<>();
        this.misDiagnosticos=new LinkedList<>();
    }

    /**
     * @return the cedula
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * @param cedula the cedula to set
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the especializacion
     */
    public String getEspecializacion() {
        return especializacion;
    }

    /**
     * @param especializacion the especializacion to set
     */
    public void setEspecializacion(String especializacion) {
        this.especializacion = especializacion;
    }

    /**
     * @return the añosExperiencia
     */
    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    /**
     * @param añosExperiencia the añosExperiencia to set
     */
    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }

    /**
     * @return the misCubiculos
     */
    public LinkedList<Cubiculo> getMisCubiculos() {
        return misCubiculos;
    }

    /**
     * @param misCubiculos the misCubiculos to set
     */
    public void setMisCubiculos(LinkedList<Cubiculo> misCubiculos) {
        this.misCubiculos = misCubiculos;
    }
    
}
