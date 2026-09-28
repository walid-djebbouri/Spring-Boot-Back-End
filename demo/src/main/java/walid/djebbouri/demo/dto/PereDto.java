package walid.djebbouri.demo.dto;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@JsonPropertyOrder({"nom", "prenom", "age", "enfants", "homes"})
public class PereDto {
    private String nom;
    private String prenom;
    private Integer age;
    private List<EnfantDto> enfants;
    private List<HomeDto> homes;

    public PereDto() {}

//    public PereDto(String nom, String prenom,int age, List<EnfantDto> Enfants, List<HomeDto> homes){
//        this.nom = nom;
//        this.prenom = prenom;
//        this.age = age;
//        this.enfants = Enfants;
//        this.homes = homes;
//    }
//    public PereDto(String nom, String prenom, Integer age) {
//        this.nom = nom;
//        this.prenom = prenom;
//        this.age = age;
//    }


}
