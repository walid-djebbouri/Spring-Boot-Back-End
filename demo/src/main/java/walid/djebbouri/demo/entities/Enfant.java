package walid.djebbouri.demo.entities;


import jakarta.persistence.*;

@Entity
public class Enfant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String prenom;
    private int age;

    @ManyToOne
    @JoinColumn(name="id_pere" ,referencedColumnName = "id")
    private Pere pere;


    public Enfant() {
    }

    public Enfant( String nom, String prenom, int age, Pere pere) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.pere = pere;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public Pere getPere() {
        return pere;
    }

    public void setPere(Pere pere) {
        this.pere = pere;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }



}
