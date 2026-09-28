package walid.djebbouri.demo.entities;

import jakarta.persistence.*;
import org.hibernate.boot.model.internal.StrictIdGeneratorResolverSecondPass;

@Entity
public class Home {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private  String nameOfHome;

    @ManyToOne(fetch = FetchType.EAGER )
    @JoinColumn(name = "id_pere", referencedColumnName = "id")
    private Pere owner;

    public Home(){}

    public Home(String nameOfHome, Pere pere) {
        this.nameOfHome = nameOfHome;
    }

    public String getNameOfHome() {
        return this.nameOfHome;
    }
    public void setNameOfHome(String nameOfHome) {
        this.nameOfHome = nameOfHome;
    }


    public Long getId() { return id;}
    public void setId(Long id) {this.id = id;}

    public Pere getOwner() {
        return this.owner;
    }
    public void setOwner(Pere owner) {
        this.owner = owner;
    }

}
