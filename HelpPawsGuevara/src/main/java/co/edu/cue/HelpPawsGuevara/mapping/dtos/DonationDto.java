package co.edu.cue.HelpPawsGuevara.mapping.dtos;

import co.edu.cue.HelpPawsGuevara.domain.entities.Foundation;
import co.edu.cue.HelpPawsGuevara.domain.entities.User;
import co.edu.cue.HelpPawsGuevara.domain.enums.PayMethod;

import java.time.LocalDate;

public record DonationDto (int id,
                           String name,
                           Double amount,
                           PayMethod payMethod,
                           java.time.LocalDate date,
                           Foundation foundation){

}
