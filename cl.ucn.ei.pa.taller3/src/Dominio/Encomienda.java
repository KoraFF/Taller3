/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

/**
 *
 * @author defGrupo()
 */
public class Encomienda extends Envio {
    
    private double largo;
    private double ancho;
    private double profundidad;

    public Encomienda(double largo, double ancho, double profundidad, int codigo, String rutRemitente, String rutDestinatario, double peso) {
        super(codigo, rutRemitente, rutDestinatario, peso);
        this.largo = largo;
        this.ancho = ancho;
        this.profundidad = profundidad;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getProfundidad() {
        return profundidad;
    }

    public void setProfundidad(double profundidad) {
        this.profundidad = profundidad;
    }
    
    @Override
    public int valor(){
        return -1;
    }
    
}