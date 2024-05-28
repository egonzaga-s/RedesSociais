package redesocial;

import exceptions.CheckedException;
import java.util.Set;

public class Usuario {

    private String nome;
    private Set<RedeSocial> redesSociais;

    public Usuario(String nome, Set<RedeSocial> redesSociais) {
        this.nome = nome;
        this.redesSociais = redesSociais;
    }


    public void adicionarRedeSocial(RedeSocial redeSocial) {
        redesSociais.add(redeSocial);
    }


    public void usarRedesSociais () throws CheckedException {
        if (redesSociais.isEmpty()) {
            throw new CheckedException("Sem rede social disponível");
        }

        for (RedeSocial rede : redesSociais) {
            rede.postarFoto();
            rede.curtir();
            rede.postarVideo();
        }
    }
}
