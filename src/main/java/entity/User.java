package entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class User {
    private String nome;
    private String cognome;
    private String dataNascita;
    private String codiceFiscale;
    private String cartaCredito;
    private List<Reservation> prenotazioni;
   // private List<AttractionRating> valutazioniAttrazioni;



    public User(String nome, String cognome, String dataNascita, String codiceFiscale, String cartaCredito) {
        this.nome = nome;
        this.cognome = cognome;
        this.dataNascita = dataNascita;
        this.codiceFiscale = codiceFiscale;
        this.cartaCredito = cartaCredito;
        this.prenotazioni = new ArrayList<>();
       // this.valutazioniAttrazioni = new ArrayList<>();
    }


    public void prenotaStanza(Room stanza, String dataInizio, String dataFine){
        Reservation prenotazione= new Reservation(stanza, dataInizio, dataFine);
        prenotazioni.add(prenotazione);
        //rendere la stanza occupata tramite boolean?? es stanza.set(false)
        stanza.setDisponibile(false);

    }

 /*   public void valutaAttrazione(Attraction attrazione, int stelle, String commento) {
        AttractionRating valutazione = new AttractionRating(attrazione, stelle, commento);
        valutazioniAttrazioni.add(valutazione);
    } */
}
