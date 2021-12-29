/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Dominio.Envio;

/**
 *
 * @author defGrupo();
 */
public class ListaEnvio {
    
    private NodoEnvio last;
    private int size;
    
    public ListaEnvio(){
        last = null;
        size = 0;
    }

    public NodoEnvio getLast() {
        return last;
    }

    public void setLast(NodoEnvio last) {
        this.last = last;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    public boolean addEnvio(Envio e){
        NodoEnvio nodo = new NodoEnvio(e);
        if(isEmpty()==true){
            last = nodo;
            last.setNext(last);
            last.setPrev(last);
        }else{
            nodo.setNext(last);
            last.getPrev().setNext(nodo);
            nodo.setPrev(last.getPrev());
            last.setPrev(nodo);
        }
        last = nodo;
        size++;
        return true;
    }
    
    public Envio getEnvioI(int i){
        NodoEnvio current = last.getNext();
        while(current != null){
            if(i==0)
                return current.getEnvio();
            i-=1;
            current = current.getNext();
        }
        return null;
    }
    
    public boolean isEmpty(){
        if(last==null)
            return true;
        return false;
    }
    
}