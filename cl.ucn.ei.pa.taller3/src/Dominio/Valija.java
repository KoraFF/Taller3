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
public class Valija extends Envio {
    
    private String material;

    public Valija(String material, int codigo, String rutRemitente, String rutDestinatario, double peso) {
        super(codigo, rutRemitente, rutDestinatario, peso);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    
    @Override
    public int valor(){
        return -1;
    }
    
}