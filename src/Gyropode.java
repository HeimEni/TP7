import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Gyropode extends CycleElectrique{
    private int tailleMinCm;
    final double  PRIX_LOCATION = 29.90;

    public Gyropode(LocalDate dateAchat, String marque, String modele, int autonomieKm, int percentBatteryLevel, int tailleMinCm) {
        super(dateAchat, marque, modele, autonomieKm, percentBatteryLevel);
        this.tailleMinCm = tailleMinCm;
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
        String b = tailleMinCm/100 + "m" + (tailleMinCm-100);
        return  this.getClass().getSimpleName() + " " +
                this.modele + " "
                + this.dateAchat.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + " ("
                + this.age() + " ans) ["
                + b + " min] "
                + this.getTarifLocationHeure() + "€/heure";
    }
}
