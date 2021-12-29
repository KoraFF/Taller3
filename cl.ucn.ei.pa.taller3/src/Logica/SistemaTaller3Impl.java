/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Dominio.*;
import java.util.*;

/**
 *
 * @author defGrupo()
 */
public class SistemaTaller3Impl implements SistemaTaller3{
    
    private ListaEnvio listaEnvio;
    private List <Cliente> listaCliente;
    private List <Oficina> listaOficina;
    
    public SistemaTaller3Impl(){
        listaEnvio = new ListaEnvio();
        listaCliente = new LinkedList <> ();
        listaOficina = new ArrayList <> ();
    }

    @Override
    public boolean addCliente(String rut, String nombre, String apellido, double saldo) {
        Cliente c = new Cliente(rut,nombre,apellido,saldo);
        return listaCliente.add(c);
    }

    @Override
    public boolean addOficina(String ciudad) {
        Oficina o = new Oficina(ciudad);
        return listaOficina.add(o);
    }

    @Override
    public boolean addDocumento(int codigo, String rutRemitente, String rutDestinatario, double peso, double grosor) {
        Documento d = new Documento(grosor,codigo,rutRemitente,rutDestinatario,peso);
        return listaEnvio.addEnvio(d);
    }

    @Override
    public boolean addEncomienda(int codigo, String rutRemitente, String rutDestinatario, double peso, double largo, double ancho, double profundidad) {
        Encomienda e = new Encomienda(largo,ancho,profundidad,codigo,rutRemitente,rutDestinatario,peso);
        return listaEnvio.addEnvio(e);
    }

    @Override
    public boolean addValija(int codigo, String rutRemitente, String rutDestinatario, double peso, String material) {
        Valija v = new Valija(material,codigo,rutRemitente,rutDestinatario,peso);
        return listaEnvio.addEnvio(v);
    }

    @Override
    public void asociarClienteAOficina(String ciudad, String rutCliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void asociarEnvioACliente(int codigo, String rutCliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void asociarEnvioAOficina(int codigo, String ciudad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String realizarEntrega(double grosor, double largo, double ancho, double profundidad, String material, String rutRemitente, String rutDestinatario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String recargarSaldo(String rut, double saldoNuevo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String obtenerEntregas(String rut) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String obtenerEntregasPorTipo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String obtenerEntregasPorOficina() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String obtenerEntregasCliente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String obtenerGanancias() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void cerrarSistema() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}