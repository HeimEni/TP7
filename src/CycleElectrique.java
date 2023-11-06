import java.time.LocalDate;

public abstract class CycleElectrique extends Cycle implements Rechargeable{
    private int autonomieKm;
    private int percentBatteryLevel;

    public CycleElectrique(LocalDate dateAchat, String marque, String modele, int autonomieKm, int percentBatteryLevel) {
        super(dateAchat, marque, modele);
        this.autonomieKm = autonomieKm;
        this.percentBatteryLevel = percentBatteryLevel;
    }

    public void charger(){
        this.percentBatteryLevel += 20;
    }
    public int getAutonomieKm(){
        return this.autonomieKm;
    }

    @Override
    public String toString() {
        return "CycleElectrique{" +
                "autonomieKm=" + autonomieKm +
                ", percentBatteryLevel=" + percentBatteryLevel +
                '}';
    }
}
