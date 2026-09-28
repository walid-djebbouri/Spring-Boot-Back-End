package walid.djebbouri.demo.Reposetories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import walid.djebbouri.demo.dto.UserWithFatherDto;
import walid.djebbouri.demo.entities.Enfant;
import walid.djebbouri.demo.entities.Pere;

import java.util.List;

@Repository
public interface EnfantRepository extends JpaRepository<Enfant, Long> {

    public Enfant findEnfantById(Long id);
    public List<Enfant> findEnfantsByNom(Long id);


    @Query("""
       select new walid.djebbouri.demo.dto.UserWithFatherDto(e.nom, p.nom)
       from Enfant e
       left join e.pere p
       where e.id = :idChild
       """)
    public UserWithFatherDto findParentByIdChild(Long idChild);

    @Query ("""
    select e from Enfant e left join e.pere p where p.nom = :parentName
    """)
    public List<Enfant> getEnfantsByParentName(@Param("parentName") String parentName);





}