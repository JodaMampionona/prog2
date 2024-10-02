package com.examen;

import java.util.ArrayList;
import java.util.List;

public class Quartier extends Endroit {
    private List<Immeuble> immeubles;

    public Quartier(String id, String nom) {
        super(id, nom);
        this.immeubles = new ArrayList<>();
    }
    public void ajouterImmeuble(Immeuble immeuble) {
        immeubles.add(immeuble);
    }

    @Override
    public List<Appartement> getAppartements() {
        List<Appartement> result = new ArrayList<>();
        for (Immeuble immeuble : immeubles) {
            result.addAll(immeuble.getAppartements());
        }
        return result;
    }

    public List<Immeuble> getImmeubles() {
        return immeubles;
    }

    public void setImmeubles(List<Immeuble> immeubles) {
        this.immeubles = immeubles;
    }
