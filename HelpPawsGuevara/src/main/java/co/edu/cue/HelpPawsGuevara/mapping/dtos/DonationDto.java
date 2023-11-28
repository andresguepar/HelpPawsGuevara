package co.edu.cue.HelpPawsGuevara.mapping.dtos;

import co.edu.cue.HelpPawsGuevara.domain.entities.Foundation;
import co.edu.cue.HelpPawsGuevara.domain.enums.PayMethod;
import lombok.Builder;

@Builder
public record DonationDto (Integer id,
                           String name,
                           Double amount,
                           PayMethod payMethod,
                           java.time.LocalDate date,
                           Foundation foundation){

}
