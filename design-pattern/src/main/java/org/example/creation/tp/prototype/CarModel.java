package org.example.creation.tp.prototype;

public class CarModel extends Model3D {

    public CarModel(String taille, String couleur, String texture) {
        super(taille, couleur, texture);
    }

    @Override
    public String getType() {
        return "Voiture";
    }

    @Override
    public CarModel clone() {
        return (CarModel) super.clone();
    }
}

