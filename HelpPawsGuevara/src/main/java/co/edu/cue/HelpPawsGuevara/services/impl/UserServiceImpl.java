package co.edu.cue.HelpPawsGuevara.services.impl;

import co.edu.cue.HelpPawsGuevara.domain.entities.User;
import co.edu.cue.HelpPawsGuevara.mapping.dtos.UserDto;
import co.edu.cue.HelpPawsGuevara.repositories.UserRepository;
import co.edu.cue.HelpPawsGuevara.services.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService{
    private final UserRepository repository;

    public UserServiceImpl(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<User> list() {
        return (List<User>) repository.findAll();
    }

    @Override
    public User byId(int id) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public void save(User t) {
        repository.save(t);
    }

    @Override
    public void delete(int id) {

    }
}
