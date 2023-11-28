package co.edu.cue.HelpPawsGuevara.services.impl;

import co.edu.cue.HelpPawsGuevara.domain.entities.Foundation;
import co.edu.cue.HelpPawsGuevara.mapping.dtos.FoundationDto;
import co.edu.cue.HelpPawsGuevara.mapping.mappers.FoundationMapper;
import co.edu.cue.HelpPawsGuevara.repositories.FoundationRepository;
import co.edu.cue.HelpPawsGuevara.services.FoundationService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FoundationServiceImpl implements FoundationService {
    private final FoundationRepository repository;

    public FoundationServiceImpl(FoundationRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<FoundationDto> list() {
        List<Foundation> foundation = (List<Foundation>) repository.findAll();
        List<FoundationDto> foundationDto = FoundationMapper.mapFromDto(foundation);
        return foundationDto;

    }

    @Override
    public FoundationDto byId(Integer id) {
        Foundation foundation = repository.findById(id).orElseThrow();
        FoundationDto foundationDto = FoundationMapper.mapFrom(foundation);
        return foundationDto;
    }

    @Override
    public FoundationDto get(Integer id) {
        Optional<Foundation> foundationOp = repository.findById(id);
        Foundation foundation = foundationOp.get();
        FoundationDto foundationDto = FoundationMapper.mapFrom(foundation);
        return foundationDto;
    }

    @Override
    public void save(FoundationDto t) {
        Foundation foundation = FoundationMapper.mapFrom(t);
        repository.save(foundation);

    }

    @Override
    public void update(Integer id, FoundationDto updatedD) {

        Foundation foundation = repository.findById(id).orElseThrow();
        Foundation updated = FoundationMapper.mapFrom(updatedD);

        foundation.setName(updated.getName());
        foundation.setAddress(updated.getAddress());
        foundation.setPhone(updated.getPhone());

        repository.save(foundation);
    }


    @Override
    public void delete(Integer id) {
        Long count = repository.countById(id);
        repository.deleteById(id);
    }
}

