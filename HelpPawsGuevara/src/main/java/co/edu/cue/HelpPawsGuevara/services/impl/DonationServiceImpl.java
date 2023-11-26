package co.edu.cue.HelpPawsGuevara.services.impl;

import co.edu.cue.HelpPawsGuevara.domain.entities.Donation;
import co.edu.cue.HelpPawsGuevara.domain.entities.User;
import co.edu.cue.HelpPawsGuevara.mapping.dtos.DonationDto;
import co.edu.cue.HelpPawsGuevara.mapping.dtos.UserDto;
import co.edu.cue.HelpPawsGuevara.repositories.DonationRepository;
import co.edu.cue.HelpPawsGuevara.services.DonationService;
import co.edu.cue.HelpPawsGuevara.services.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DonationServiceImpl implements DonationService {
    private final DonationRepository repository;

    public DonationServiceImpl(DonationRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Donation> list() {
        return (List<Donation>) repository.findAll();
    }

    @Override
    public Donation byId(int id) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public void save(Donation t) {
        repository.save(t);
    }

    @Override
    public void delete(int id) {

    }
}
