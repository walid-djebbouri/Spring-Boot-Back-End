package walid.djebbouri.demo.poo;

public interface interfaceClass {
    
      int x = 0;
    public void interfaceFonction();
    public void interfaceFonction(int x);
    
    public default void example() {
        System.out.println("i'm an example of interface method " + x);
    } 
    
}
