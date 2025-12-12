package org.example.creation.tp.prototype;

public class PlaneModel extends Model3D {

    public PlaneModel(String taille, String couleur, String texture) {
        super(taille, couleur, texture);
    }

    @Override
    public String getType() {
        return "Avion";
    }

    @Override
    public PlaneModel clone() {
        return (PlaneModel) super.clone();
    }
}

