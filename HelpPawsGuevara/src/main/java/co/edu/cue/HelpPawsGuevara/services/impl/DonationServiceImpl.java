package co.edu.cue.HelpPawsGuevara.services.impl;

import co.edu.cue.HelpPawsGuevara.domain.entities.Donation;
import co.edu.cue.HelpPawsGuevara.mapping.dtos.DonationDto;
import co.edu.cue.HelpPawsGuevara.mapping.mappers.DonationMapper;
import co.edu.cue.HelpPawsGuevara.repositories.DonationRepository;
import co.edu.cue.HelpPawsGuevara.services.DonationService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DonationServiceImpl implements DonationService {
    private final DonationRepository repository;

    public DonationServiceImpl(DonationRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<DonationDto> list() {
        List<Donation> donation = (List<Donation>) repository.findAll();
        return DonationMapper.mapFromDto(donation);
    }

    @Override
    public DonationDto byId(int id) {
        Donation donation = repository.findById(id).orElseThrow();
        return DonationMapper.mapFrom(donation);
    }

    @Override
    public void save(DonationDto t) {
        Donation donation = DonationMapper.mapFrom(t);
        repository.save(donation);
    }

    @Override
    public void delete(int id) {

    }
}
