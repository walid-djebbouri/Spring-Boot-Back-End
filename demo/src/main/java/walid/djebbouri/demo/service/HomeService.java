package walid.djebbouri.demo.service;

import org.springframework.stereotype.Service;
import walid.djebbouri.demo.Reposetories.HomeRepository;
import walid.djebbouri.demo.Reposetories.PereRepository;
import walid.djebbouri.demo.dto.HomeDto;
import walid.djebbouri.demo.entities.Home;
import walid.djebbouri.demo.entities.Pere;
import walid.djebbouri.demo.mapper.HomeMapper;

@Service
public class HomeService {
    private final HomeRepository homeRepository;
    private final PereRepository pereRepository;

    public HomeService(HomeRepository homeRepository, PereRepository pereRepository) {
        this.homeRepository = homeRepository;
        this.pereRepository = pereRepository;
    }

    public HomeDto addNewHome(HomeDto home) {
        Pere pere = pereRepository.findById(home.getPereId())
                .orElseThrow(() -> new RuntimeException("Pere not found"));
         Home h = new Home(home.getNameOfHome(), pere);
         Home savedHome = homeRepository.save(h);
         return HomeMapper.entityToDto(savedHome);
    }
}
