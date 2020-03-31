package com.company;

//@author Gabriel Lima

public class Main {

    public static void main(String[] args) {


        ZapGroup grupo = new ZapGroup();


        MembrosGrupo Gabriel = new MembrosGrupo("Gabriel");
        grupo.AdicionarMmbro(Gabriel, 1);


        MembrosGrupo Messias = new MembrosGrupo("Messias");
        grupo.AdicionarMmbro(Messias, 2);

        MembrosGrupo João_Carlos = new MembrosGrupo("João Carlos");
        grupo.AdicionarMmbro(João_Carlos,3);

        MembrosGrupo Moabe = new MembrosGrupo("Moabe");
        grupo.AdicionarMmbro(Moabe,4);









        grupo.novaMensagem(new Mensagem(Gabriel, "Boa Tarde Amigos"));
        grupo.novaMensagem(new Mensagem(Messias, "Eaeeeeee"));
        grupo.novaMensagem(new Mensagem(João_Carlos, "saaaaaaaalve"));
        grupo.novaMensagem(new Mensagem(Moabe, "coeeeeee maluco"));



    }

}
