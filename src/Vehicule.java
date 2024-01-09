import java.io.Serializable;



public abstract class Vehicule implements Motorisation,Serializable {
    private String matricule;
    private int annee;
    private int prix;
    private int carburant;
    public Vehicule(int annee){
        this.annee = annee;

    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }
    public String getMatricule(){
        return matricule;
    }
    public void setAnnee(int annee){
        this.annee = annee;
    }
    public int getAnnee(){
        return annee;
    }
    public void setPrix(int prix){
        this.prix = prix;
    }
    public int getPrix(){
        return prix;
    }

    public void setCarburant(int carburant) {
        this.carburant = carburant;
    }

    public int getCarburant() {
        return carburant;
    }

    @Override
    public String toString() {
        return "Vehicule{" +
                "matricule='" + matricule + '\'' +
                ", annee=" + annee +
                ", prix=" + prix +
                '}';
    }
}
