package walid.djebbouri.demo.service;

import org.springframework.stereotype.Service;
import walid.djebbouri.demo.Reposetories.EnfantRepository;
import walid.djebbouri.demo.Reposetories.PereRepository;
import walid.djebbouri.demo.dto.EnfantDto;
import walid.djebbouri.demo.entities.Enfant;
import walid.djebbouri.demo.entities.Pere;

@Service
public class EnfantService {
    private final EnfantRepository enfantRepository;
    private final PereRepository pereRepository;

    public EnfantService(EnfantRepository enfantRepository, PereRepository pereRepository) {
        this.enfantRepository = enfantRepository;
        this.pereRepository = pereRepository;
    }

    public void addEnfant(EnfantDto enfant) {
        Pere pere = pereRepository.findById(enfant.getIdParent())
                .orElseThrow(() -> new RuntimeException("Pere not found"));
        Enfant e = new Enfant(enfant.getNom(), enfant.getPrenom(), enfant.getAge());
        e.setPere(pere);
        enfantRepository.save(e);
    }

    public Enfant getEnfant(Long id) {
        return enfantRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Enfant not found"));
    }
}
