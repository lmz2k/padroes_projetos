package com.company;

//@author Gabriel Lima


public class MembrosGrupo extends Observer {

    private String name;
    private Integer id;

    public MembrosGrupo(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public void update(Mensagem menssage) {
        if (menssage.getMembro().equals(this)) {
            System.out.println(menssage.getMembro().getName() + ": " + menssage.getMensagemDeTexto());

        }
    }
}