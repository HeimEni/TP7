import java.sql.Date;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;


public class Velo extends Cycle{
    private int nbVitesses;
    static final double PRIX_LOCATION = 4.90;

    public Velo(LocalDate dateAchat, String marque, String modele, int nbVitesses) {
        super(dateAchat, marque, modele);
        this.nbVitesses = nbVitesses;
    }

    @Override
    public int age() {
        return (int) ChronoUnit.YEARS.between(dateAchat, LocalDate.now());
    }

    @Override
    public double getTarifLocationHeure() {
        return PRIX_LOCATION;
    }

    @Override
    public String toString() {
        return  this.getClass().getSimpleName() + " " +
                String.format(this.modele + " "
                + this.dateAchat.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + " ("
                + this.age() + " ans) "
                + this.nbVitesses + " vitesses "
                + this.getTarifLocationHeure()) + "€/heure";
    }
}
