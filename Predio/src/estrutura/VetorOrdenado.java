/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estrutura;

import predio.Mapa;
import predio.Predio;

/**
 *
 * @author Vinicius
 */
public class VetorOrdenado {

    private Predio[] predios;
    private int numeroElementos;

    public VetorOrdenado(int tamanho) {
        predios = new Predio[tamanho];
        numeroElementos = 0;
    }

    public void inserir(Predio predio) {
        int posicao;
        for (posicao = 0; posicao < numeroElementos; posicao++) {
            if (predios[posicao].getDistanciaObjetivo() > predio.getDistanciaObjetivo()) {
                break;
            }
        }

        for (int k = numeroElementos; k > posicao; k--) {
            predios[k] = predios[k - 1];
        }
        predios[posicao] = predio;
        numeroElementos++;
    }

    public Predio getPrimeiro() {
        return predios[0];
    }

    public void mostrar() {
        for (int i = 0; i < numeroElementos; i++) {
            System.out.println(predios[i].getNome() + " - " + predios[i].getDistanciaObjetivo());
        }
    }

    public static void main(String args[]) {
        Mapa mapa = new Mapa();
        VetorOrdenado vetor = new VetorOrdenado(5);

        vetor.inserir(mapa.getPredio01()); 
        vetor.inserir(mapa.getPredio02()); 
        vetor.inserir(mapa.getPredio03()); 
        vetor.inserir(mapa.getPredio04()); 
        vetor.inserir(mapa.getPredio05()); 
        vetor.inserir(mapa.getPredio06());
        vetor.inserir(mapa.getPredio07());
        vetor.inserir(mapa.getPredio08()); 
        vetor.inserir(mapa.getPredio09()); 
        vetor.inserir(mapa.getPredio10()); 
        vetor.inserir(mapa.getPredio11()); 
        vetor.inserir(mapa.getPredio12()); 
        vetor.inserir(mapa.getPredio13());
        vetor.inserir(mapa.getPredio14());
        vetor.inserir(mapa.getPredio15()); 
        vetor.inserir(mapa.getPredio16()); 
        vetor.inserir(mapa.getPredio17()); 
        vetor.inserir(mapa.getPredio18()); 
        vetor.inserir(mapa.getPredio19()); 
        vetor.inserir(mapa.getPredio20());
        vetor.inserir(mapa.getPredio21());
        vetor.inserir(mapa.getPredio22()); 
        vetor.inserir(mapa.getPredio23()); 
        vetor.inserir(mapa.getPredio24()); 
        vetor.inserir(mapa.getPredio25()); 
        vetor.inserir(mapa.getPredio26()); 
        vetor.inserir(mapa.getPredio27());
        vetor.inserir(mapa.getPredio28());
        vetor.inserir(mapa.getPredio29()); 
        vetor.inserir(mapa.getPredio30()); 
        vetor.inserir(mapa.getPredio31()); 
        vetor.inserir(mapa.getPredio32()); 
        vetor.inserir(mapa.getPredio33()); 
        vetor.inserir(mapa.getPredio34());
        vetor.inserir(mapa.getPredio35());
        vetor.inserir(mapa.getPredio36()); 
        vetor.inserir(mapa.getPredio37()); 
        vetor.inserir(mapa.getPredio38()); 
        vetor.inserir(mapa.getPredio39()); 
        vetor.inserir(mapa.getPredio40()); 
        vetor.inserir(mapa.getPredio41());
        vetor.inserir(mapa.getPredio42());
        vetor.inserir(mapa.getPredio43()); 
        vetor.inserir(mapa.getPredio44()); 
        vetor.inserir(mapa.getPredio45()); 
        vetor.inserir(mapa.getPredio46()); 
        vetor.inserir(mapa.getPredio47()); 
        vetor.inserir(mapa.getPredio48());
        vetor.inserir(mapa.getPredio49());

        vetor.mostrar();
    }
}