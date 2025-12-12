package org.example.creation.tp.prototype;

public class Demo {

    public static void main(String[] args) {
        HouseModel maison = new HouseModel("Grande", "Blanc", "Brique");
        HouseModel copieMaison = maison.clone();
        copieMaison.setCouleur("Rouge");
        
        System.out.println(maison);
        System.out.println(copieMaison);

        CarModel voiture = new CarModel("Compacte", "Noir", "Métallique");
        CarModel copieVoiture = voiture.clone();
        copieVoiture.setCouleur("Bleu");
        
        System.out.println(voiture);
        System.out.println(copieVoiture);
    }
}

