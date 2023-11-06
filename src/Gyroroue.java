import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Gyroroue extends CycleElectrique{
    static final double PRIX_LOCATION = 18.90;

    public Gyroroue(LocalDate dateAchat, String marque, String modele, int autonomieKm, int percentBatteryLevel) {
        super(dateAchat, marque, modele, autonomieKm, percentBatteryLevel);
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
                this.modele + " "
                + this.dateAchat.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + " ("
                + this.age() + " ans) "
                + this.getTarifLocationHeure() + "€/heure";
    }
}
