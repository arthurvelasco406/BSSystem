
package model;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Deck {
    private String titulo;
    private ArrayList cartas;
    private int qtdPersonagens;
    private int qtdCenarios;
    private int qtdSuportes;
    private int qtdHabilidades;
    private String observacoes;

    public Deck(String titulo, ArrayList cartas, int qtdPersonagens, int qtdCenarios, int qtdSuportes, int qtdHabilidades, String observacoes) {
        this.titulo = titulo;
        this.cartas = cartas;
        this.qtdPersonagens = qtdPersonagens;
        this.qtdCenarios = qtdCenarios;
        this.qtdSuportes = qtdSuportes;
        this.qtdHabilidades = qtdHabilidades;
        this.observacoes = observacoes;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ArrayList getCartas() {
        return cartas;
    }

    public void setCartas(ArrayList cartas) {
        this.cartas = cartas;
    }

    public int getQtdPersonagens() {
        return qtdPersonagens;
    }

    public void setQtdPersonagens(int qtdPersonagens) {
        this.qtdPersonagens = qtdPersonagens;
    }

    public int getQtdCenarios() {
        return qtdCenarios;
    }

    public void setQtdCenarios(int qtdCenarios) {
        this.qtdCenarios = qtdCenarios;
    }

    public int getQtdSuportes() {
        return qtdSuportes;
    }

    public void setQtdSuportes(int qtdSuportes) {
        this.qtdSuportes = qtdSuportes;
    }

    public int getQtdHabilidades() {
        return qtdHabilidades;
    }

    public void setQtdHabilidades(int qtdHabilidades) {
        this.qtdHabilidades = qtdHabilidades;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
    
    
    
}
