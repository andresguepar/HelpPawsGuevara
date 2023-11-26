package co.edu.cue.HelpPawsGuevara.services;

import co.edu.cue.HelpPawsGuevara.domain.entities.User;
import co.edu.cue.HelpPawsGuevara.mapping.dtos.UserDto;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {
    List<User> list();
    User byId(int id);
    void save(User t);
    void delete(int id);

}
