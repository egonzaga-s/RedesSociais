package redesocial;

public abstract class RedeSocial {
    String nome;

    public RedeSocial(String nome) {
        this.nome = nome;
    }

    public abstract void postarFoto();

    public abstract void curtir();

    public abstract void postarVideo();

    public void compartilharPost() {

        System.out.println("Compartilhou post no " + nome);
    }
}
