/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Usuario
 */
public class Habilidade extends Carta{
    
    private String poder;
    private boolean antecipacao;
    private boolean imprevista;

    
    public Habilidade(String poder, boolean antecipacao, boolean imprevista, String nome, String versao, String raridade, String colecao, String texto, int qtd) {
        super(nome, versao, raridade, colecao, texto, qtd);
        this.poder = poder;
        this.antecipacao = antecipacao;
        this.imprevista = imprevista;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public boolean isAntecipacao() {
        return antecipacao;
    }

    public void setAntecipacao(boolean antecipacao) {
        this.antecipacao = antecipacao;
    }

    public boolean isImprevista() {
        return imprevista;
    }

    public void setImprevista(boolean imprevista) {
        this.imprevista = imprevista;
    }

    @Override
    public String toString() {
        return "Habilidade{" + "poder=" + poder + ", antecipacao=" + antecipacao + ", imprevista=" + imprevista + '}';
    }
    
}