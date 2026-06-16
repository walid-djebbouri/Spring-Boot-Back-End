package walid.djebbouri.demo.poo;

public abstract class abstracTclass {

    public int x ;
    private  String s;

    public void nonAbstractFonction() {
        System.out.println("i'm not an abstract  method");
    }
    public abstract void abstractFonction(String s, int x) ;
    public abstract int abstractFonction(int x, String s);
}
