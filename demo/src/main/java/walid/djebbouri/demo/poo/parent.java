package walid.djebbouri.demo.poo;

import walid.djebbouri.demo.InvalidAgeException;

public class parent implements interfaceClass {

    Child child;

    public parent() {
        try {
            child = new Child("Default", "Name", 0);
        } catch (InvalidAgeException e) {
            // 0 est valide, donc normalement on ne passera pas ici; mais en cas d'erreur,
            // on crée une instance de secours avec age=0
            System.err.println("Erreur lors de la création de child: " + e.getMessage());
            try {
                child = new Child("Default", "Name", 0);
            } catch (InvalidAgeException ex) {
                throw new RuntimeException(ex);
            }
        }
    }

    @Override
    public void interfaceFonction() {
         System.out.println(interfaceClass.x);
    }

    @Override
    public void interfaceFonction(int x) {

    }
}
