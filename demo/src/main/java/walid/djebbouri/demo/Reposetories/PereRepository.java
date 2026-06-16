package walid.djebbouri.demo.Reposetories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import walid.djebbouri.demo.entities.Pere;

@Repository
public interface PereRepository extends JpaRepository<Pere, Long> {
}