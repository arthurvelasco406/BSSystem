
package model;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Colecao {
    private ArrayList cartas;

    public Colecao(ArrayList cartas) {
        this.cartas = cartas;
    }

    public ArrayList getCartas() {
        return cartas;
    }
    
    public void setCartas(ArrayList cartas){
        this.cartas = cartas;
    }

    public void addCartas(ArrayList cartas) {
        this.cartas.addAll(cartas);
    }
    
    public void addCarta(Carta carta){
        this.cartas.add(carta);
    }

    @Override
    public String toString() {
        return "Colecao{" + "cartas=" + cartas + '}';
    }
}
