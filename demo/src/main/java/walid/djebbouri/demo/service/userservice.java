package walid.djebbouri.demo.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import walid.djebbouri.demo.Reposetories.userCredentialRepository;
import walid.djebbouri.demo.dto.UserDetailsDto;
import walid.djebbouri.demo.mapper.userMapper;

@Service
@RequiredArgsConstructor


public class userservice {

    final private  userCredentialRepository  repository ;




    public void addNewUser(UserDetailsDto user) {

        repository.save(userMapper.userDtoToUserEntity(user));


    }

    public UserDetailsDto getUserByUserName(String username) {
        return userMapper.userEntityToUserDto(repository.findUserByUsername(username).orElseThrow(

        ));


    }
}
