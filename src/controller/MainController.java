/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.Desktop;
import java.io.File;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import views.Colecao;
import views.Decks;
import views.GameCards;
import views.Historico;
import views.Main;
import views.NovaPartida;
import views.NovoDeck;
import views.Pesquisa;
import views.Sobre;

/**
 *
 * @author Usuario
 */
public class MainController {

    private final Main view;

    public MainController(Main view) {
        this.view = view;
    }

    //MÉTODOS PARA CRIAR AS OUTRAS JANELAS
    public void interfaceDecks() {
        Decks decks = Decks.getInstance();
        decks.setVisible(true);
        decks.setState(JFrame.NORMAL);
    }

    public void interfaceNovaPartida() {
        NovaPartida novaPartida = NovaPartida.getInstance();
        novaPartida.setVisible(true);
        novaPartida.setState(JFrame.NORMAL);
    }

    public void interfaceNovoDeck() {
        NovoDeck novoDeck = NovoDeck.getInstance();
        novoDeck.setVisible(true);
        novoDeck.setState(JFrame.NORMAL);
    }

    public void interfaceHistorico() {
        Historico historico = Historico.getInstance();
        historico.setVisible(true);
        historico.setState(JFrame.NORMAL);
    }

    public void interfaceRegras() {
        //Abre o arquivo de manual de regras
        ClassLoader cl = this.getClass().getClassLoader();
        File pdf = new File(cl.getResource("data/files/Regras_Completas.pdf").toString().replace("file:", ""));
        try {
            Desktop.getDesktop().open(pdf);
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro no Desktop: " + ex);
        }
    }

    public void interfaceSobre() {
        Sobre sobre = Sobre.getInstance();
        sobre.setVisible(true);
        sobre.setState(JFrame.NORMAL);
    }

    public void interfaceColecao() {
        Colecao colecao = Colecao.getInstance();
        colecao.setVisible(true);
        colecao.setState(JFrame.NORMAL);
    }

    public void interfaceGameCards() {
        GameCards gameCards = GameCards.getInstance();
        gameCards.setVisible(true);
        gameCards.setState(JFrame.NORMAL);

    }

    //Ver como desenvolver a inerface e a forma de pesquisa primeiro.
    public void pesquisar() {
        /*Pesquisa pesquisa = Pesquisa.getInstance();
        pesquisa.setVisible(true);*/
    }
}
