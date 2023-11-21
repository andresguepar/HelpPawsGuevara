package co.edu.cue.HelpPawsGuevara.mapping.dtos;

import co.edu.cue.HelpPawsGuevara.domain.entities.Foundation;
import co.edu.cue.HelpPawsGuevara.domain.entities.User;
import jakarta.persistence.OneToOne;

import java.util.Date;

public record DonationDto ( Long id,
                            User user,
                            Double amount,
                            String address,
                            Date date,
                            Foundation foundation){
}
