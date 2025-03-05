package model.DAO;

import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import model.Colecao;

/**
 *
 * @author Usuario
 */
public class DAOColecao {

    DAOCartas daoCartas = new DAOCartas();

    public Colecao parserSimpleColecao(JSONArray array) {
        ArrayList cartas = new ArrayList();

        for (int i = 0; i <= array.size() - 1; i++) {
            JSONObject obj = (JSONObject) array.get(i);

            cartas.add(daoCartas.parserSimpleCarta(obj));
        }

        Colecao colecao = new Colecao(cartas);

        return colecao;
    }

    public Colecao parserComleteColecao(JSONArray array) {
        ArrayList cartas = new ArrayList();

        for (int i = 0; i <= array.size() - 1; i++) {
            JSONObject obj = (JSONObject) array.get(i);

            cartas.add(daoCartas.parserCompleteCarta(obj));
        }

        Colecao colecao = new Colecao(cartas);

        return colecao;
    }
}
