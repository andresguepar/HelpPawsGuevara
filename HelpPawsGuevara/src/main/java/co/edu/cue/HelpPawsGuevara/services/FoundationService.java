package co.edu.cue.HelpPawsGuevara.services;

import co.edu.cue.HelpPawsGuevara.mapping.dtos.FoundationDto;

import java.util.List;

public interface FoundationService {
    List<FoundationDto> list();
    FoundationDto byId(Integer id);
    FoundationDto get(Integer id);
    void save(FoundationDto t);
    void update(Integer id, FoundationDto updated);
    void delete(Integer id);

}
