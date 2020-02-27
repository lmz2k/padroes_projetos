package com.company;

public class Tomada_tres_pinos {

    boolean pTerra;
    boolean  pNeutro;



    public boolean ispTerra() {
        return pTerra;
    }

    public void setpTerra(boolean pTerra) {
        this.pTerra = pTerra;
    }

    public boolean ispNeutro() {
        return pNeutro;
    }

    public void setpNeutro(boolean pNeutro) {
        this.pNeutro = pNeutro;
    }

    public boolean ispFase() {
        return pFase;
    }

    public void setpFase(boolean pFase) {
        this.pFase = pFase;
    }

    boolean pFase;


    public Tomada_tres_pinos(boolean pTerra, boolean pNeutro, boolean pFase) {
        this.pTerra = pTerra;
        this.pNeutro = pNeutro;
        this.pFase = pFase;
    }


    void conectarComEnergia(){

        if (this.pFase && this.pNeutro && this.pTerra) System.out.println("Conectado com sucesso!");

    }



}
