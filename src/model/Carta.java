/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Usuario
 */
abstract class Carta{
    private String nome;
    private String versao;
    //private String ou Enum tipo;
    private String raridade;
    private String colecao;
    private String texto;
    private int qtd;

    public Carta(String nome, String versao, String raridade, String colecao, String texto, int qtd) {
        this.nome = nome;
        this.versao = versao;
        this.raridade = raridade;
        this.colecao = colecao;
        this.texto = texto;
        this.qtd = qtd;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getVersao() {
        return versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }

    public String getRaridade() {
        return raridade;
    }

    public void setRaridade(String raridade) {
        this.raridade = raridade;
    }

    public String getColecao() {
        return colecao;
    }

    public void setColecao(String colecao) {
        this.colecao = colecao;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
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
