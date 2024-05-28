import exceptions.CheckedException;
import exceptions.UncheckedException;
import redesocial.Facebook;
import redesocial.Instagram;
import redesocial.RedeSocial;
import redesocial.Usuario;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<RedeSocial> redes = new HashSet<>();
        redes.add(new Facebook());
        redes.add(new Instagram());


        Usuario usuario = new Usuario("FulanoDeTal", redes);

        try {
            usuario.usarRedesSociais();
        } catch (UncheckedException e) {
            System.out.println("Erro nao verificado : " + e.getMessage());
        } catch (CheckedException e) {
            System.out.println("Erro verificado : " + e.getMessage());
        }
    }
}
