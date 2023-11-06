import java.time.LocalDate;

public class Gyropode extends CycleElectrique{
    private int tailleMinCm;
    final double  PRIX_LOCATION = 29.90;

    public Gyropode(LocalDate dateAchat, String marque, String modele, int autonomieKm, int percentBatteryLevel, int tailleMinCm) {
        super(dateAchat, marque, modele, autonomieKm, percentBatteryLevel);
        this.tailleMinCm = tailleMinCm;
    }
}
