/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio9;

/**
 *
 * @author arlin
 */
public class Camera {
    
    private int numeroCamera;
    private String tipologia;
    private boolean occupata;

    public Camera(int numeroCamera, String tipologia, boolean occupata) {
        this.numeroCamera = numeroCamera;
        this.tipologia = tipologia;
        this.occupata = occupata;
    }

    public int getNumeroCamera() {
        return numeroCamera;
    }

    public String getTipologia() {
        return tipologia;
    }

    public boolean isOccupata() {
        return occupata;
    }
    
    
    
    
}
