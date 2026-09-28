package walid.djebbouri.demo.mapper;

import walid.djebbouri.demo.dto.UserDetailsDto;
import walid.djebbouri.demo.entities.userCredentialEntity;

public class userMapper {

    public static  userCredentialEntity userDtoToUserEntity(UserDetailsDto user) {
        if (user == null) return null;
        userCredentialEntity userCredentialEntity = new userCredentialEntity();
        userCredentialEntity.setUsername(user.getUsername());
        userCredentialEntity.setPassword(user.getPassword());
        return userCredentialEntity;
    }

    public static  UserDetailsDto userEntityToUserDto(userCredentialEntity user) {
        if (user == null) return null;
        UserDetailsDto userDetailsDto = new UserDetailsDto();
        userDetailsDto.setUsername(user.getUsername());
        userDetailsDto.setPassword(user.getPassword());
        return userDetailsDto;
    }
}
