/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import Logica.*;

/**
 *
 * @author defGrupo()
 */
public class Cliente {
    
    private String rut;
    private String nombre;
    private String apellido;
    private double saldo;
    private Oficina ciudad;
    private ListaEnvio envios;

    public Cliente(String rut, String nombre, String apellido, double saldo) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.saldo = saldo;
        ciudad = null;
        envios = new ListaEnvio();
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Oficina getCiudad() {
        return ciudad;
    }

    public void setCiudad(Oficina ciudad) {
        this.ciudad = ciudad;
    }

    public ListaEnvio getEnvios() {
        return envios;
    }

    public void setEnvios(ListaEnvio envios) {
        this.envios = envios;
    }
    
}