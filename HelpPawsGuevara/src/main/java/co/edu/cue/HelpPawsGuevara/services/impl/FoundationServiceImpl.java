package co.edu.cue.HelpPawsGuevara.services.impl;

import co.edu.cue.HelpPawsGuevara.domain.entities.Foundation;
import co.edu.cue.HelpPawsGuevara.mapping.dtos.FoundationDto;
import co.edu.cue.HelpPawsGuevara.repositories.FoundationRepository;
import co.edu.cue.HelpPawsGuevara.services.FoundationService;
import co.edu.cue.HelpPawsGuevara.services.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FoundationServiceImpl implements FoundationService {
    private final FoundationRepository repository;

    public FoundationServiceImpl(FoundationRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Foundation> list() {
        return (List<Foundation>) repository.findAll();

    }

    @Override
    public Foundation byId(int id) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public void save(Foundation t) {
        repository.save(t);

    }

    @Override
    public void delete(int id) {

    }
}

