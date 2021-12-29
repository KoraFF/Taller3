/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Dominio.Envio;

/**
 *
 * @author defGrupo()
 */
public class NodoEnvio {
    
    private Envio envio;
    private NodoEnvio prev;
    private NodoEnvio next;
    
    public NodoEnvio(Envio envio){
        this.envio = envio;
        prev = next = null;
    }

    public Envio getEnvio() {
        return envio;
    }

    public void setEnvio(Envio envio) {
        this.envio = envio;
    }

    public NodoEnvio getPrev() {
        return prev;
    }

    public void setPrev(NodoEnvio prev) {
        this.prev = prev;
    }

    public NodoEnvio getNext() {
        return next;
    }

    public void setNext(NodoEnvio next) {
        this.next = next;
    }
    
}