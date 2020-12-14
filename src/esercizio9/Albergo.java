/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio9;
import java.util.ArrayList;
import java.util.GregorianCalendar;
/**
 *
 * @author arlin
 */
public class Albergo {
 
    private String nomeAlbergo;
    private ArrayList <Prenotazione> listaPrenotazioni;
    private ArrayList <Camera> listaCamere;

    public Albergo(String nomeAlbergo) {
        this.nomeAlbergo = nomeAlbergo;
        this.listaCamere = new ArrayList<>();
        this.listaPrenotazioni = new ArrayList<>();
    }
    
    public void addPrenotazione(Prenotazione newPrenotazione){
    
        this.listaPrenotazioni.add(newPrenotazione);
    }
    
    public boolean removePrenotazione(int codicePrenotazione){
    
        for(int i=0; i<this.listaPrenotazioni.size(); i++){
        
            if(this.listaPrenotazioni.get(i).getCodicePrenotazione() == codicePrenotazione){
            
                this.listaPrenotazioni.remove(i);
                return true;
            }
        }
        return false;
    }
    
    public void addCamera(Camera newCamera){
    
        this.listaCamere.add(newCamera);
    }
    
    public boolean removeCamera(int numeroCameraDaRm){
    
        for(int i=0; i<this.listaCamere.size(); i++){
        
            if(this.listaCamere.get(i).getNumeroCamera() == numeroCameraDaRm){
            
                this.listaCamere.remove(i);
                return true;
            }
        }
        return false;
    }
    
    public ArrayList prenotazioniGiorno(GregorianCalendar dataP){
    
        ArrayList <Prenotazione> prenotazioniGiorno = new ArrayList<>();
        
        for(int i=0; i<this.listaPrenotazioni.size(); i++){
        
            if(this.listaPrenotazioni.get(i).getDataInizio().equals(dataP)){
                
                prenotazioniGiorno.add(this.listaPrenotazioni.get(i));
            } 
        }
        return prenotazioniGiorno;
    }
    
    public ArrayList camereLibere(){
        
        ArrayList <Camera> camere = new ArrayList<>();
        
        for(int i=0; i<this.listaCamere.size(); i++){
        
            if(this.listaCamere.get(i).isOccupata() == false){
            
                camere.add(this.listaCamere.get(i));
            }
        }
        return camere;
    }
          
    
}
