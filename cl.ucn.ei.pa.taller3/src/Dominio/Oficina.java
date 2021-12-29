/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import Logica.*;
import java.util.*;

/**
 *
 * @author defGrupo()
 */
public class Oficina {
    
    private String ciudad;
    private ListaEnvio envios;
    List <Cliente> clientes;

    public Oficina(String ciudad) {
        this.ciudad = ciudad;
        envios = new ListaEnvio();
        clientes = new LinkedList<>();
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public ListaEnvio getEnvios() {
        return envios;
    }

    public void setEnvios(ListaEnvio envios) {
        this.envios = envios;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }
    
}