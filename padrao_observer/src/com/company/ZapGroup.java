package com.company;

//@author Gabriel Lima

import java.util.HashMap;
import java.util.Set;


public class ZapGroup {

    private HashMap<Integer, MembrosGrupo> UsersMap;


    public ZapGroup() {
        this.UsersMap = new HashMap<>();
    }

    public void AdicionarMmbro(MembrosGrupo user, int ID) {
        user.setId(ID);
        this.UsersMap.put(ID, user);
    }

    public void novaMensagem(Mensagem menssage) {
        notifyUsers(menssage);
    }

    public void notifyUsers(Mensagem menssage) {
        MembrosGrupo sender = this.UsersMap.get(menssage.getMembro().getId());

        sender.update(menssage);
        Set<Integer> UsersKey = UsersMap.keySet();

        for (Integer id: UsersKey ) {
            if (!UsersMap.get(id).equals(sender)) {
                UsersMap.get(id).update(menssage);
            }
        }

    }




}