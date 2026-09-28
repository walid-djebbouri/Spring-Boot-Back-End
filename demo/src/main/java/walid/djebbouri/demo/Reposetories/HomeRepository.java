package walid.djebbouri.demo.Reposetories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import walid.djebbouri.demo.entities.Home;

@Repository
public interface HomeRepository extends JpaRepository<Home, Long> {
}
