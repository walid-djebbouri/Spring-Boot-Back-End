package walid.djebbouri.demo.mapper;

import walid.djebbouri.demo.dto.HomeDto;
import walid.djebbouri.demo.entities.Home;

public class HomeMapper {
    public static Home DtoToEntity(HomeDto dto) {
        if(dto == null) {
            return null;
        }
        Home home = new Home();
        home.setNameOfHome(dto.getNameOfHome());
        return home;
    }

    public static HomeDto entityToDto(Home home) {
        if (home == null) {
            return null;
        }
        HomeDto dto = new HomeDto();
        dto.setId(home.getId());
        dto.setNameOfHome(home.getNameOfHome());
        dto.setPereId(home.getOwner().getId());
        return dto;
    }
}
