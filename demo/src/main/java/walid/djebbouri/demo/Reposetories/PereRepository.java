package walid.djebbouri.demo.Reposetories;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import walid.djebbouri.demo.entities.Pere;

import java.util.Optional;

@Repository
public interface PereRepository extends JpaRepository<Pere, Long> {

    @Query("""
     Select p from Pere p
     left join fetch p.enfants e
     where p.id = :parentId
    """)
    public Pere getParentAndHisChildrenAndHomesById(@Param("parentId") Long parentId);



    @EntityGraph(attributePaths = {"homes", "enfants"})
    public Optional<Pere>  findWithHomesAndEnfantsById(Long id);


}
