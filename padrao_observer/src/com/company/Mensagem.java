package com.company;

//@author Gabriel Lima


public class Mensagem {

    private MembrosGrupo membro;
    private String mensagemDeTexto;

    public Mensagem(MembrosGrupo membro, String texto) {
        this.membro = membro;
        this.mensagemDeTexto = texto;
    }

    public MembrosGrupo getMembro() {
        return membro;
    }

    public void setMembro(MembrosGrupo membro) {
        this.membro = membro;
    }

    public String getMensagemDeTexto() {
        return mensagemDeTexto;
    }

    public void setMensagemDeTexto(String mensagemDeTexto) {
        this.mensagemDeTexto = mensagemDeTexto;
    }
}