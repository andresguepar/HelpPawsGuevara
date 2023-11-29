package co.edu.cue.HelpPawsGuevara.services;

import co.edu.cue.HelpPawsGuevara.mapping.dtos.FoundationDto;

import java.util.List;

public interface FoundationService {
    List<FoundationDto> list();
    FoundationDto byId(int id);
    FoundationDto get(int id);
    void save(FoundationDto t);
    void update(int id, FoundationDto updated);
    void delete(int id);

}
