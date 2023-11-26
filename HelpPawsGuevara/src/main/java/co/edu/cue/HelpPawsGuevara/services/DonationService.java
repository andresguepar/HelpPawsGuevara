package co.edu.cue.HelpPawsGuevara.services;

import co.edu.cue.HelpPawsGuevara.domain.entities.Donation;
import co.edu.cue.HelpPawsGuevara.mapping.dtos.DonationDto;
import org.springframework.stereotype.Service;

import java.util.List;

public interface DonationService {
    List<Donation> list();
    Donation byId(int id);
    void save(Donation t);
    void delete(int id);

}
