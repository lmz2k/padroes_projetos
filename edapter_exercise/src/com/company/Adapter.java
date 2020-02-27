package com.company;

public class Adapter extends Tomada_tres_pinos implements Conector_2_pinos{



    public Adapter( boolean pNeutro, boolean pFase) {
        super(false, pNeutro, pFase);

    }


    @Override
    public void conectar() {

        super.setpTerra(true);
        super.conectarComEnergia();


    }
}
