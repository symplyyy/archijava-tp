package org.example.creation.tp.prototype;

public class HouseModel extends Model3D {

    public HouseModel(String taille, String couleur, String texture) {
        super(taille, couleur, texture);
    }

    @Override
    public String getType() {
        return "Maison";
    }

    @Override
    public HouseModel clone() {
        return (HouseModel) super.clone();
    }
}

