
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
