package entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Reservation {
    private Room stanza;
    private String dataInizio;
    private String dataFine;


}
