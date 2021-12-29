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
public class Documento extends Envio{
    
    private double grosor;

    public Documento(double grosor, int codigo, String rutRemitente, String rutDestinatario, double peso) {
        super(codigo, rutRemitente, rutDestinatario, peso);
        this.grosor = grosor;
    }

    public double getGrosor() {
        return grosor;
    }

    public void setGrosor(double grosor) {
        this.grosor = grosor;
    }
    
    @Override
    public int valor(){
        
        return -1;
    }
    
}