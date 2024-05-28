package redesocial;

public class Instagram extends RedeSocial {

    public Instagram() {
        super("Instagram" );
    }

    @Override
    public void postarFoto() {
        System.out.println("Postou uma foto no Instagram");
    }

    @Override
    public void curtir() {
        System.out.println("Curtiu algo no Instagram");
    }



    @Override
    public void postarVideo() {
        System.out.println("Postou um video no Instagram");
    }
}
