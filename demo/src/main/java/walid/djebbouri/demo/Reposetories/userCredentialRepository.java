package walid.djebbouri.demo.Reposetories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import walid.djebbouri.demo.entities.userCredentialEntity;

@Repository
public interface userCredentialRepository extends JpaRepository< userCredentialEntity, Long> {
}
