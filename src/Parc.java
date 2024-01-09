import java.io.*;


public class Parc {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
         Voiture v1 = Voiture.buildCar(1998,Carburant.GAZ);
         Camion a1 = Camion.buildAutoCar(2021,Carburant.DISEL);
        Voiture v2 = Voiture.buildCar(1998,Carburant.GAZ);
        Camion a2= Camion.buildAutoCar(2021,Carburant.DISEL);


         v1.addCarburant(30);
         v1.periodiciteVidange();
        System.out.println(v1.toString());

         a1.addCarburant(20);
         a1.periodiciteVidange();
        System.out.println(a1.toString());

        v2.addCarburant(12);
        v2.periodiciteVidange();
        System.out.println(v2.toString());

        a2.addCarburant(19);
        a2.periodiciteVidange();
        System.out.println(a2.toString());

        FileOutputStream aa = new FileOutputStream("garage");
        ObjectOutputStream bb = new ObjectOutputStream(aa);
        bb.writeObject(v1);
        bb.close();
        aa.close();


        FileInputStream cc = new FileInputStream ("garage");
        ObjectInputStream dd = new ObjectInputStream(cc);

        Voiture voiture1 = (Voiture)dd.readObject();
        dd.close();
        cc.close();


        System.out.println(voiture1.toString());
    }
}