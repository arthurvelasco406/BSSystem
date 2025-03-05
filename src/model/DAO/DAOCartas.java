
/*
NOTE:
Essa classe é um DAO diferente dos convencionais. Ele não cria e não exclui dados.
Ele serve unicamente para trazer os dados presentes no sistema, no caso, das cartas.
Então, ele possui apenas a funcionalidade de pesquisar e listar todos os elementos
do diretorio que contem os dados das cartas.
 */
package model.DAO;

import java.io.File;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.Carta;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 *
 * @author Usuario
 */
public class DAOCartas {

    private static DAOCartas daoCartas;

    private File dirData = new File("db/cartas/data");
    private File dirImg = new File("db/cartas/images");

    public static DAOCartas getInstance() {
        if (daoCartas == null) {
            daoCartas = new DAOCartas();
        }

        return daoCartas;
    }

    //Pesquisa no diretório do sistema que contem todas as cartas do jogo. 
    //Não serve para pequisas feita na colecao ou deck.
    public ArrayList<Carta> pesquisarDados(String nome) {
        if (nome == "" || nome == null) {
            erro("Pesquisa com parâmetro vazio.");
        }

        //Filtro para saber se o nome do arquivo tem a string de pesquisa
        FilenameFilter filter = new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.toLowerCase().contains(nome.toLowerCase());
            }
        };

        File[] files = dirData.listFiles(filter);

        JSONParser jsonParser = new JSONParser();
        
        ArrayList<Carta> lista = new ArrayList<>();

        for (int i = 0; i <= files.length - 1; i++) {

            try (FileReader reader = new FileReader(files[i])) {
                JSONObject obj = (JSONObject) jsonParser.parse(reader);
                
                lista.add(parserCompleteCarta(obj));
                
            } catch (Exception e) {
                erro(e.toString());
            }
        }
        
        return lista;
    }

    public ImageIcon pesquisarImagem(String nome) {
        //TODO:
        return null;
    }

    public ArrayList<Carta> listar() {
        //TODO: buscar todas as cartas no banco e transforma em objetos Carta e retornar todas em um ArrayList
        return null;
    }

    public Carta parserCompleteCarta(JSONObject c) {
        Carta carta = new Carta(c.get("nome").toString(), c.get("versao").toString(), c.get("tipo").toString(), c.get("raridade").toString(), c.get("colecao").toString(), c.get("texto").toString());

        return carta;

    }

    public Carta parserSimpleCarta(JSONObject c) {
        Carta carta = new Carta(c.get("nome").toString(), Integer.parseInt(c.get("quantidade").toString()));

        return carta;
    }

    private void erro(String msg) {
        ImageIcon icon = new ImageIcon("images/gifs/erro_deadpool.gif");
        JOptionPane.showMessageDialog(null, msg, "Erro", 0, icon);
    }
}
