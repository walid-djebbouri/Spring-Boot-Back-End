package walid.djebbouri.demo.service.jwt;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import walid.djebbouri.demo.Reposetories.userCredentialRepository;
import walid.djebbouri.demo.dto.UserDetailsDto;
import walid.djebbouri.demo.mapper.userMapper;

@Service
@RequiredArgsConstructor


public class userService {

    final private  userCredentialRepository  repository ;




    public void addNewUser(UserDetailsDto user) {

        repository.save(userMapper.userDtoToUserEntity(user));


    }
}
