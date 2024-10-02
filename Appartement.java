package com.examen;

class Appartement {
    private String id;
    private String titre;
    private String description;
    private double loyerMensuel;
    private String Statut;
    private String Endroit ;

    public Appartement(String id, String titre, String description, double loyerMensuel, String Statut, String Endroit) {
        this.id = id;
        this.titre = titre;
        this.description = description;
        this.loyerMensuel = loyerMensuel;
        this.Statut = Statut;
        this.Endroit = Endroit;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getLoyerMensuel() {
        return loyerMensuel;
    }

    public void setLoyerMensuel(double loyerMensuel) {
        this.loyerMensuel = loyerMensuel;
    }

    public String getStatut() {
        return Statut;
    }

    public void setStatut(String statut) {
        Statut = statut;
    }

    public String getEndroit() {
        return Endroit;
    }



    @Override
    public String toString() {
        return "Appartement [id=" + this.id + ", titre=" + this.titre + ", description=" + this.description + ", loyerMensuel=" + this.loyerMensuel + ", statut=" + this.Statut + "]";
    }

    public static void main(String[] args) {
        public boolean contientAppartement(Appartement appartement) {
            for (Immeuble immeuble : immeubles) {
                if (immeuble.getAppartements().contains(appartement)) {
                    return true;
                }
            }
            return false;
        }

    }
}

