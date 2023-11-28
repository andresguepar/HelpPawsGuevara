package co.edu.cue.HelpPawsGuevara.mapping.mappers;

import co.edu.cue.HelpPawsGuevara.domain.entities.Donation;
import co.edu.cue.HelpPawsGuevara.mapping.dtos.DonationDto;
import lombok.Builder;

import java.util.List;
@Builder
public class DonationMapper {
        public static DonationDto mapFrom(Donation source){
            return new DonationDto(source.getId(),
                    source.getName(),
                    source.getAmount(),
                    source.getPayMethod(),
                    source.getDate(),
                    source.getFoundation());
        }

        public static Donation mapFrom(DonationDto source){
            return new Donation(source.id(),
                    source.name(),
                    source.amount(),
                    source.payMethod(),
                    source.date(),
                    source.foundation());
        }

        public static List<Donation> mapFrom(List<DonationDto> source){
            return source.parallelStream()
                    .map(DonationMapper::mapFrom)
                    .toList();

        }
        public static List<DonationDto> mapFromDto(List<Donation> source){
            return source.parallelStream()
                    .map(DonationMapper::mapFrom)
                    .toList();

        }
}

