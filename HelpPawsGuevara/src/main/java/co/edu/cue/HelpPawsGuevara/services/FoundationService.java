package co.edu.cue.HelpPawsGuevara.services;

import co.edu.cue.HelpPawsGuevara.domain.entities.Foundation;
import co.edu.cue.HelpPawsGuevara.mapping.dtos.FoundationDto;
import org.springframework.stereotype.Service;

import java.util.List;

public interface FoundationService {
    List<Foundation> list();
    Foundation byId(int id);
    void save(Foundation t);
    void delete(int id);

}
