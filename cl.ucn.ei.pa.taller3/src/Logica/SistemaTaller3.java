/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author defGrupo()
 */
public interface SistemaTaller3 {
    
    public boolean addCliente(String rut, String nombre, String apellido, double saldo);
    public boolean addOficina(String ciudad);
    public boolean addDocumento(int codigo, String rutRemitente, String rutDestinatario, double peso, double grosor);
    public boolean addEncomienda(int codigo, String rutRemitente, String rutDestinatario, double peso, double largo, double ancho, double profundidad);
    public boolean addValija(int codigo, String rutRemitente, String rutDestinatario, double peso, String material);
    public void asociarClienteAOficina(String ciudad, String rutCliente);
    public void asociarEnvioACliente(int codigo, String rutCliente);
    public void asociarEnvioAOficina(int codigo, String ciudad);
    public String realizarEntrega(double grosor, double largo, double ancho, double profundidad, String material, String rutRemitente, String rutDestinatario);
    public String recargarSaldo(String rut, double saldoNuevo);
    public String obtenerEntregas(String rut);
    public String obtenerEntregasPorTipo();
    public String obtenerEntregasPorOficina();
    public String obtenerEntregasCliente();
    public String obtenerGanancias();
    public void cerrarSistema();
    
}