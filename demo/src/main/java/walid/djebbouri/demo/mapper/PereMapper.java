package walid.djebbouri.demo.mapper;

import walid.djebbouri.demo.dto.EnfantDto;
import walid.djebbouri.demo.dto.HomeDto;
import walid.djebbouri.demo.dto.PereDto;
import walid.djebbouri.demo.entities.Enfant;
import walid.djebbouri.demo.entities.Home;
import walid.djebbouri.demo.entities.Pere;

import java.util.List;
import java.util.stream.Collectors;

public class PereMapper {

    public static Pere dtoToEntity(PereDto pereDto) {
        if (pereDto == null) {
            return null;
        }
        Pere pere = new Pere();
        pere.setNom(pereDto.getNom());
        pere.setPrenom(pereDto.getPrenom());
        pere.setAge(pereDto.getAge());
        return pere;

    }

    public static PereDto entityToDto(Pere pere) {
        if (pere == null) {
            return null;
        }
        PereDto pereDto = new PereDto();
        pereDto.setNom(pere.getNom());
        pereDto.setPrenom(pere.getPrenom());
        pereDto.setAge(pere.getAge());
        
        List<EnfantDto> enfantsDtos = pere.getEnfants().stream()
                .map(PereMapper::mapEnfantToDto)
                .collect(Collectors.toList());
        pereDto.setEnfants(enfantsDtos);
        
        List<HomeDto> homesDtos = pere.getHomes().stream()
                .map(PereMapper::mapHomeToDto)
                .collect(Collectors.toList());
        pereDto.setHomes(homesDtos);
        
        return pereDto;
    }

    private static EnfantDto mapEnfantToDto(Enfant enfant) {
        if (enfant == null) {
            return null;
        }
        return new EnfantDto(enfant.getId(), enfant.getNom(), enfant.getPrenom(), enfant.getAge(), enfant.getPere().getId());
    }

    private static HomeDto mapHomeToDto(Home home) {
        if (home == null) {
            return null;
        }
        return new HomeDto(home.getId(), home.getNameOfHome());
    }
}
