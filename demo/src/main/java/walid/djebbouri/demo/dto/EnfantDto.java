package walid.djebbouri.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EnfantDto {
    private Long Id;
    private String nom;
    private String prenom;
    private int age;
    private Long idParent;
}
