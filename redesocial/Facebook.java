package redesocial;

public class Facebook extends RedeSocial {

    public Facebook() {
        super("Facebook" );
    }

    @Override
    public void postarFoto() {
        System.out.println("Postou uma foto no Facebook");
    }

    @Override
    public void curtir() {
        System.out.println("Curtiu algo no Facebook");
    }



    @Override
    public void postarVideo() {
        System.out.println("Postou um video no Facebook");
    }
}
