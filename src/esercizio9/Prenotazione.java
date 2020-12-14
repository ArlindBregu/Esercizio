/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio9;
import java.util.GregorianCalendar;

/**
 *
 * @author arlin
 */
public class Prenotazione {
    
    private GregorianCalendar dataInizio;
    private GregorianCalendar dataFine;
    private String nomeCliente;
    private Camera cameraPrenotata;
    private int codicePrenotazione;
    
    static int aggiornaCodicePrenotazione=1;

    public Prenotazione(int annoDataInizio, int meseDataInizio, int giornoDataInizio, int annoDataFine, int meseDataFine, int giornoDataFine, String nomeCliente, Camera cameraPrenotata) {
        this.dataInizio = new GregorianCalendar(annoDataInizio, meseDataInizio, giornoDataInizio);
         this.dataFine = new GregorianCalendar(annoDataFine, meseDataFine, giornoDataFine);
        this.nomeCliente = nomeCliente;
        this.cameraPrenotata = cameraPrenotata;
        this.codicePrenotazione = aggiornaCodicePrenotazione;
        
        aggiornaCodicePrenotazione++;
    }

    public GregorianCalendar getDataInizio() {
        return dataInizio;
    }

    public GregorianCalendar getDataFine() {
        return dataFine;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public Camera getCameraPrenotata() {
        return cameraPrenotata;
    }

    public int getCodicePrenotazione() {
        return codicePrenotazione;
    }
    
    
    
    
    
}
