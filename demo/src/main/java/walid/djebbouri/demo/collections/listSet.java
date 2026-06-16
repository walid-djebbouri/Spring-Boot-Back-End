package walid.djebbouri.demo.collections;

import walid.djebbouri.demo.poo.Child;
import walid.djebbouri.demo.InvalidAgeException;

import java.util.*;

public class listSet {

    public List<String> list = new ArrayList<String>();
    public Set<String> set = new HashSet<String>();
    public   Set<Child> setChild = new HashSet<Child>();

    Child child;
    Child child2;

    // initialisation dans le constructeur pour gérer l'exception checked
    public listSet() {
        try {
            child = new Child("walid", "djebbouri", 30);
            child2 = new Child("walid", "djebbouri", 30);
        } catch (InvalidAgeException e) {
            System.err.println("Age invalide détecté lors de l'initialisation : " + e.getMessage() + ". Remplacement par age=18.");
            try {
                child = new Child("walid", "djebbouri", 18);
                child2 = new Child("walid", "djebbouri", 18);
            } catch (InvalidAgeException ex) {
                // ne devrait pas arriver; convertir en runtime pour ne pas cacher l'erreur
                throw new RuntimeException(ex);
            }
        }
    }

    public List<String> getList() {
        this.list.add("a");
        this.list.add("b");
        this.list.add("c");
        this.list.add("f");
        this.list.set(2, "a");


        return list;
    }

    public String getListByIndex(int index) {
        return this.list.get(index);

    }
    
    public String getListElementByName(String string) {
        return  this.list.get(  this.list.indexOf(string));
    }
    
    public void inicializeSet(){

        this.setChild.add(child);
        this.setChild.add(child2);
        System.out.println( child.equals(child2) );

        this.set.add("a");
        this.set.add("b");
        this.set.add("c");
        this.set.add("f");

    }
    
    public String  getSetByIndex(int index) {
        List<String> setToList = new ArrayList<>(this.set);
        return   setToList.get(index) ;

    }

    public String getSetElementBYStreamFilter(String element) {

        return this.set.stream()
                .filter(e -> e.equals(element))
                .findFirst().orElse("n'existe pas malheureusement ");

    }

    public String getSetElementByIteration(String element) {

        for (String str : this.set) {
            if (str.equals(element)) {
                return str;
            }
        }
        return "n'existe pas malheureusement";
    }

    public boolean compareTowChild( Child child, Child child2 ) {
        return child.equals(child2);

    }


}
