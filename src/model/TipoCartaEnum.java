/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Usuario
 */
public enum TipoCartaEnum {
    
    PERSONGEM("Persongem"),
    CENARIO("Cenário"),
    SUPORTE("Suporte"),
    HABILIDADE("Habilidade");
    
    private String tipo;

    private TipoCartaEnum(String t) {
        this.tipo = t;
    }

    public String getTipo() {
        return tipo;
    }
    
    
    
}
