
package model;

import java.time.LocalDate;

/**
 *
 * @author Usuario
 */
public class Partida {
    //
    private String nome;
    private String jogador;
    private String oponente;
    private String deckJogador;
    private String deckOponente;
    private int pontosJogador;
    private int pontosOponente;
    private String observacoes;
    private LocalDate data;

    public Partida(String nome, String jogador, String oponente, String deckJogador, String deckOponente, int pontosJogador, int pontosOponente, String observacoes, LocalDate data) {
        this.nome = nome;
        this.jogador = jogador;
        this.oponente = oponente;
        this.deckJogador = deckJogador;
        this.deckOponente = deckOponente;
        this.pontosJogador = pontosJogador;
        this.pontosOponente = pontosOponente;
        this.observacoes = observacoes;
        this.data = data;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getJogador() {
        return jogador;
    }

    public void setJogador(String jogador) {
        this.jogador = jogador;
    }

    public String getOponente() {
        return oponente;
    }

    public void setOponente(String oponente) {
        this.oponente = oponente;
    }

    public String getDeckJogador() {
        return deckJogador;
    }

    public void setDeckJogador(String deckJogador) {
        this.deckJogador = deckJogador;
    }

    public String getDeckOponente() {
        return deckOponente;
    }

    public void setDeckOponente(String deckOponente) {
        this.deckOponente = deckOponente;
    }

    public int getPontosJogador() {
        return pontosJogador;
    }

    public void setPontosJogador(int pontosJogador) {
        this.pontosJogador = pontosJogador;
    }

    public int getPontosOponente() {
        return pontosOponente;
    }

    public void setPontosOponente(int pontosOponente) {
        this.pontosOponente = pontosOponente;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Partida{" + "nome=" + nome + ", jogador=" + jogador + ", oponente=" + oponente + ", deckJogador=" + deckJogador + ", deckOponente=" + deckOponente + ", pontosJogador=" + pontosJogador + ", pontosOponente=" + pontosOponente + ", observacoes=" + observacoes + ", data=" + data + '}';
    }       
}
