/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package predio;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Vinicius
 */
public class Predio {

    private String nome;
    private boolean visitado;
    private List<Adjacente> adjacentes;
    
    public Predio (String nome){
        this.nome = nome;
        visitado = false;
        adjacentes = new ArrayList<Adjacente>();
    }
    
    public void addPredioAdjacente(Adjacente Predio) {
        adjacentes.add(Predio);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isVisitado() {
        return visitado;
    }

    public void setVisitado(boolean visitado) {
        this.visitado = visitado;
    }

    public List<Adjacente> getAdjacentes() {
        return adjacentes;
    }

    public int getDistanciaObjetivo() {
        int distanciaObjetivo = 0;
        return distanciaObjetivo;
    }

    public Predio(String nome, boolean visitado) {
        this.nome = nome;
        this.visitado = visitado;
    }
   
}
