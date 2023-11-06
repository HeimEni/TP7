import java.time.LocalDate;

public class Velo extends Cycle{
    private int nbVitesses;
    static final double PRIX_LOCATION = 4.90;

    public Velo(LocalDate dateAchat, String marque, String modele, int nbVitesses) {
        super(dateAchat, marque, modele);
        this.nbVitesses = nbVitesses;
    }
}
