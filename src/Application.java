import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Scanner;

public class Application {
    public static void AfficherCycles(ArrayList<Cycle> arrayCycle){
        System.out.println("Voici les cycles que nous proposons à la location : ");
        for (Cycle c : arrayCycle){
            System.out.println(c);
        }
    }
    public static void AfficherCycleElectrique(ArrayList<Cycle> arrayCycle){
        System.out.println("Voici les cycles electriques que nous proposons à la location : ");
        for (Cycle c : arrayCycle){
            if(c instanceof CycleElectrique){
                System.out.println(c);
            }
        }
    }
    public static void AfficherCycleElectriqueWithBatterie(ArrayList<CycleElectrique> arrayCycleElectrique){
        System.out.println("Voici les cycles électriques louables (niveau batterie > 30) :");
        for (CycleElectrique c : arrayCycleElectrique){
            if(c.getAutonomieKm() > 30){
                System.out.println(c);
            }
        }
    }
    public static void AfficherVelo(ArrayList<Cycle> arrayCycle){
        System.out.println("Voici les vélos que nous proposons à la location : ");
        for (Cycle c : arrayCycle){
            if(c instanceof Velo){
                System.out.println(c);
            }
        }
    }

    public static void main(String[] args) {
        Velo v1 = new Velo(LocalDate.of(2017, Month.JUNE,2),"Lapierre","speed 400",27);
        Velo v2 = new Velo(LocalDate.of(2018, Month.APRIL,9),"Btwin","riverside 900",10);
        Gyropode g1 = new Gyropode(LocalDate.of(2018, Month.JULY,5),"Segway","Ninebot Elite",40,100,150);
        Gyropode g2 = new Gyropode(LocalDate.of(2017, Month.JUNE,2),"Weebot","Echo ",35,100,160);
        Gyroroue g3 = new Gyroroue(LocalDate.of(2018, Month.MARCH,25),"Immotion","v8",40,100);
        Gyroroue g4 = new Gyroroue(LocalDate.of(2018, Month.MARCH,25),"Segway","Ninebot",30,100);
        ArrayList<Cycle> arrayCycle= new ArrayList<>();
        ArrayList<CycleElectrique> arrayCycleElectrique = new ArrayList<>();
        arrayCycle.add(v1);
        arrayCycle.add(v2);
        arrayCycle.add(g1);
        arrayCycle.add(g2);
        arrayCycle.add(g3);
        arrayCycle.add(g4);
        arrayCycleElectrique.add(g1);
        arrayCycleElectrique.add(g2);
        arrayCycleElectrique.add(g3);
        arrayCycleElectrique.add(g4);
        System.out.println("1 - Lister tous les cycles disponibles ");
        System.out.println("2 - Lister les cycles éléctriques disponibles ");
        System.out.println("3 - Lister les vélo disponibles ");
        System.out.println("4 - Recharger un cycle éléctrique ");
        Scanner scanner = new Scanner(System.in);

        switch (scanner.next()){
            case "1":
                AfficherCycles(arrayCycle);
                break;
            case "2":
                AfficherCycleElectrique(arrayCycle);
                break;
            case "3":
                AfficherVelo(arrayCycle);
                break;
            case "4":
                AfficherCycleElectriqueWithBatterie(arrayCycleElectrique);
                break;
            default:
                System.out.println("Incorrect value, please retry");
                break;

        }
    }
}
