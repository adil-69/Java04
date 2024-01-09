public class Camion extends Vehicule {
    private static int nbMax = 50;
    private static int capacite = 2000;
    private static int quantite = 0;
    private Carburant carburant;
    private int periodiciteVidange;
    private boolean toitReplie;
    private Camion(int annee, Carburant carburant) {
        super(annee);
        this.setMatricule(this.getClass().getName()+":"+ ++quantite);
        this.carburant = carburant;
    }
    public static Camion buildAutoCar(int modele, Carburant carburant) {
        if (quantite < nbMax) return new Camion(modele,carburant);
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
        return "Autocar " + super.toString() +
                ", type du carburant: " +carburant + " periodicite de vidange: "+
                periodiciteVidange +" mois";
    }
}
