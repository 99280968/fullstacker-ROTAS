/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package predio;

/**
 *
 * @author Vinicius
 */
public class Adjacente {
    private Predio predio;
    private int distance;
    
    
    public Adjacente(Predio predio, int distancia){
        this.predio = predio;
        this.distance = distancia;
    }
    
    public Predio getPredio() {
        return predio;
    }
    
    public void setRua(Predio rua) {
        this.predio = rua;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    
}
