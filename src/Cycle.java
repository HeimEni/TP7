import java.time.LocalDate;

public abstract class Cycle {
    private LocalDate dateAchat;
    private String marque;
    private String modele;

    public Cycle(LocalDate dateAchat, String marque, String modele) {
        this.dateAchat = dateAchat;
        this.marque = marque;
        this.modele = modele;
    }
    public abstract int age();
    public abstract double getTarifLocationHeure();
    public abstract String toString();

}
