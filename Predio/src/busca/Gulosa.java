/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busca;

import estrutura.VetorOrdenado;
import predio.Adjacente;
import predio.Mapa;
import predio.Predio;
/**
 *
 * @author Vinicius
 */
public class Gulosa {

    private VetorOrdenado fronteira;
    private Predio objetivo;
    private boolean achou;

    public Gulosa(Predio objetivo) {
        this.objetivo = objetivo;
        achou = false;
    }

    public void buscar(Predio atual) {
        System.out.println("\nAtual: " + atual.getNome());
        atual.setVisitado(true);

        if (atual == objetivo) {
            achou = true;
        } else {
            fronteira = new VetorOrdenado(atual.getAdjacente().size());
            for (Adjacente a : atual.getAdjacentes()) {
                if (!a.getPredio().isVIsitado()) {
                    a.getPredio().setVisitado(true);
                    fronteira.inserir(a.getPredio());
                }
            }
            fronteira.mostrar();
            if (fronteira.getPrimeiro() != null) {
                buscar(fronteira.getPrimeiro());
            }
        }
    }

    public static void main(String args[]) {
        Mapa mapa = new Mapa();
        Gulosa g = new Gulosa(mapa.getPredio01());
        g.buscar(mapa.getPredio10());

    }
}
