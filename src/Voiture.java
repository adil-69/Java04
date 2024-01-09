import java.io.Serializable;


public class Voiture extends Vehicule implements Decapotable{
    private static int nbMax = 100;
    private static int capacite = 1400;
    private static int quantite = 0;
    private Carburant carburant;
    private int periodiciteVidange;
    private boolean toitReplie;
    private Voiture (int annee, Carburant carburant) {
        super(annee);
        this.setMatricule(this.getClass().getName()+":"+ ++quantite);
        this.carburant = carburant;
    }
    public static Voiture buildCar(int modele, Carburant carburant) {
        if (quantite < nbMax) return new Voiture(modele,carburant);
        return null;
    }
    public void addCarburant(int carburant) {
        if ((getCarburant()+carburant)<= capacite)
            setCarburant(getCarburant()+carburant);
        else {
            double max_carburant_ajout = getCarburant() - capacite ;
            this.setCarburant(capacite);
        }
    }

    @Override
    public Carburant typeCarburant() {
        return carburant;
    }

    @Override
    public void periodiciteVidange() {
        switch (carburant) {
            case DISEL:periodiciteVidange = 13; break;
            case ESSENCE: periodiciteVidange = 7; break;
            case GAZ: periodiciteVidange = 11; break;
            default: periodiciteVidange = 12; break;
        }
    }
    public void replieLeToit() {
        toitReplie = true;
    }
    public int getPeriodiciteeVidange() {
        return periodiciteVidange;
    }
    public String toString() {
        return "Voiture " + super.toString() +
         ", type du carburant: " +carburant + " periodicite de vidange: "+
                 periodiciteVidange +" mois";
    }


}
