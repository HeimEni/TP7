import javax.xml.stream.Location;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Cycle extends Location {
    protected LocalDate dateAchat;
    protected String marque;
    protected String modele;

    public Cycle(LocalDate dateAchat, String marque, String modele, LocalDate dateDebut) {
        super(dateDebut);
        this.dateAchat = dateAchat;
        this.marque = marque;
        this.modele = modele;
    }
    public abstract int age();
    public abstract double getTarifLocationHeure();
    public abstract String toString();

}
