
package model;

/**
 *
 * @author Usuario
 */
public class Carta{
    private final String nome;
    private final String versao;
    private final TipoCartaEnum tipo;
    private final String raridade;
    private final String colecao;
    private final String texto;
    private int qtd;

    public Carta(String nome, String versao, String tipo, String raridade, String colecao, String texto) {
        this.nome = nome;
        this.versao = versao;
        this.tipo = TipoCartaEnum.valueOf(tipo.toUpperCase());
        this.raridade = raridade;
        this.colecao = colecao;
        this.texto = texto;
        this.qtd = 0;
    }
    
    public Carta(String nome, int qtd){
        this.nome = nome;
        this.qtd = qtd;
        
        this.versao = null;
        this.tipo = null;
        this.raridade = null;
        this.colecao = null;
        this.texto = null;
    }

    public String getNome() {
        return nome;
    }

    public String getVersao() {
        return versao;
    }
    
    public String getTipo(){
        return tipo.getTipo();
    }

    public String getRaridade() {
        return raridade;
    }

    public String getColecao() {
        return colecao;
    }

    public String getTexto() {
        return texto;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    @Override
    public String toString() {
        return "Carta{" + "nome=" + nome + ", versao=" + versao + ", raridade=" + raridade + ", colecao=" + colecao + ", texto=" + texto + ", qtd=" + qtd + '}';
    }
    
    
}
