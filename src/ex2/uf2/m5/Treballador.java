/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2.uf2.m5;

/**
 *
 * @author Reskitow
 */
public enum Treballador {
    DIRECTOR("DIRECTOR", 0, 0), SUBDIRECTOR("SUBDIRECTOR", 0, 0);

    private String tipusTreballador;
    private int nomina;
    private int horesExtres;

    private Treballador(String tipusTreballador, int nomina, int horesExtres) {
        this.tipusTreballador = tipusTreballador;
        this.nomina = nomina;
        this.horesExtres = horesExtres;
    }

    public String getTipusTreballador() {
        return tipusTreballador;
    }

    public int getNomina() {
        return nomina;
    }

    public int getHoresExtres() {
        return horesExtres;
    }

    public void setTipusTreballador(String tipusTreballador) {
        this.tipusTreballador = tipusTreballador;
    }

    public void setNomina(int nomina) {
        this.nomina = nomina;
    }

    public void setHoresExtres(int horesExtres) {
        this.horesExtres = horesExtres;
    }

}
