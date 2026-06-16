package walid.djebbouri.demo.poo;

import java.util.Objects;
import walid.djebbouri.demo.InvalidAgeException;

public class Child extends abstracTclass {

    private String nom ;
    private String prenom ;
    private int age ;

    // Le constructeur vérifie que l'âge n'excède pas 18 et lance InvalidAgeException sinon
    public Child(String nom, String prenom, int age) throws InvalidAgeException {
        if (age > 18) {
            throw new InvalidAgeException("Age invalide: " + age + " (doit être <= 18)");
        }
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }


    @Override
    public void abstractFonction(String x, int y) {
        System.out.println("i'm an abstract method ");
    }

    @Override
    public int abstractFonction(int x , String s) {
        return x*x;
    }

    public void nonAbstractFonction() {
        System.out.println("i'm not an abstract  method");
        System.out.println("e");
    }

//    @Override
//    public String toString() {
//        return "Child{" +
//                "nom='" + nom + '\'' +
//                ", prenom='" + prenom + '\'' +
//                ", age=" + age +
//                '}';
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Child child = (Child) o;
        return  Objects.equals(age, child.age)  && Objects.equals(nom, child.nom) && Objects.equals(prenom, child.prenom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, prenom, age);
    }
}
