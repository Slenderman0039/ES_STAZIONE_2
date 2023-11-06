package entity;

import lombok.Data;

@Data
public class Room {
    private int numeroPosti;
    private String tipo;
    private double tariffaGiornaliera;
    private boolean disponibile;

    public Room(int numeroPosti, String tipo, double tariffaGiornaliera) {
        this.numeroPosti = numeroPosti;
        this.tipo = tipo;
        this.tariffaGiornaliera = tariffaGiornaliera;
        this.disponibile = true;
    }

    //Implementare nuvoi metodi per la disponibilità etccc
}
