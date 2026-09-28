package walid.djebbouri.demo.service;

import org.springframework.stereotype.Service;
import walid.djebbouri.demo.Reposetories.PereRepository;
import walid.djebbouri.demo.dto.PereDto;
import walid.djebbouri.demo.entities.Pere;
import walid.djebbouri.demo.mapper.PereMapper;

@Service
public class PereService {

    private final PereRepository pereRepository;

    public PereService(PereRepository pRepository ) {
        this.pereRepository = pRepository;

    }

    public void addPere(PereDto pere) {
        pereRepository.save(PereMapper.dtoToEntity(pere));
    }

    public PereDto getParentAndHisChildrenAndHomesById(Long id) {
        Pere pere = pereRepository.getParentAndHisChildrenAndHomesById(id);
        return PereMapper.entityToDto(pere);
    }

    public PereDto findWithHomesAndEnfantsById(Long id) {
        Pere pere = pereRepository.findWithHomesAndEnfantsById(id).orElseThrow();
        return PereMapper.entityToDto(pere);
    }

   public PereDto findSimpleParent(Long id){
        Pere pere =        pereRepository.findById(id).orElseThrow(  () -> new RuntimeException("Pere not found"));
                return PereMapper.entityToDto(pere);

   }
}
