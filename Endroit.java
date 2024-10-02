package com.examen;

public abstract class Endroit {
    private int id;
    private String nom;

    public Endroit(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public abstract List<Appartement> getAppartements();

    @Override
    public String toString() {
        return "Endroit [id=" + this.id + ", nom=" + this.nom + "]";
    }

}
