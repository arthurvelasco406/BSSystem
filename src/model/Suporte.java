/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Usuario
 */
public class Suporte extends Carta{
    private int energia;
    private int escudo;
    private String afiliacao;

    public Suporte(int energia, int escudo, String afiliacao, String nome, String versao, String raridade, String colecao, String texto, int qtd) {
        super(nome, versao, raridade, colecao, texto, qtd);
        this.energia = energia;
        this.escudo = escudo;
        this.afiliacao = afiliacao;
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

    @Override
    public String toString() {
        return "Suporte{" + "energia=" + energia + ", escudo=" + escudo + ", afiliacao=" + afiliacao + '}';
    }
    
    
}
