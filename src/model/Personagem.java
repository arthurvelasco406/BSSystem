/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Usuario
 */
public class Personagem extends Carta{
    
    private String alterego;
    private int energia;
    private int escudo;
    private String afiliacao;
    private String alinhamento;
    private String poderes;
    private boolean antecipacao;
    private boolean imprevista;

    
    public Personagem(String alterego, int energia, int escudo, String afiliacao, String alinhamento, String poderes, boolean antecipacao, boolean imprevista, String nome, String versao, String raridade, String colecao, String texto, int qtd) {
        super(nome, versao, raridade, colecao, texto, qtd);
        this.alterego = alterego;
        this.energia = energia;
        this.escudo = escudo;
        this.afiliacao = afiliacao;
        this.alinhamento = alinhamento;
        this.poderes = poderes;
        this.antecipacao = antecipacao;
        this.imprevista = imprevista;
    }

    public String getAlterego() {
        return alterego;
    }

    public void setAlterego(String alterego) {
        this.alterego = alterego;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getEscudo() {
        return escudo;
    }

    public void setEscudo(int escudo) {
        this.escudo = escudo;
    }

    public String getAfiliacao() {
        return afiliacao;
    }

    public void setAfiliacao(String afiliacao) {
        this.afiliacao = afiliacao;
    }

    public String getAlinhamento() {
        return alinhamento;
    }

    public void setAlinhamento(String alinhamento) {
        this.alinhamento = alinhamento;
    }

    public String getPoderes() {
        return poderes;
    }

    public void setPoderes(String poderes) {
        this.poderes = poderes;
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
        return "Personagem{" + "alterego=" + alterego + ", energia=" + energia + ", escudo=" + escudo + ", afiliacao=" + afiliacao + ", alinhamento=" + alinhamento + ", poderes=" + poderes + ", antecipacao=" + antecipacao + ", imprevista=" + imprevista + '}';
    }
}
