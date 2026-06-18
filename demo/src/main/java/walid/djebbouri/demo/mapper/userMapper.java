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
}
