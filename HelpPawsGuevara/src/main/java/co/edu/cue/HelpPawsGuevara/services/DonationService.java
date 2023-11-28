package co.edu.cue.HelpPawsGuevara.services;

import co.edu.cue.HelpPawsGuevara.mapping.dtos.DonationDto;

import java.util.List;

public interface DonationService {
    List<DonationDto> list();
    DonationDto byId(Integer id);
    void save(DonationDto t);
    void delete(Integer id);

}
