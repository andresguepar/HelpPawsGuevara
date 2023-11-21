package co.edu.cue.HelpPawsGuevara.mapping.mappers;

import co.edu.cue.HelpPawsGuevara.domain.entities.Donation;
import co.edu.cue.HelpPawsGuevara.domain.entities.User;
import co.edu.cue.HelpPawsGuevara.mapping.dtos.DonationDto;
import co.edu.cue.HelpPawsGuevara.mapping.dtos.UserDto;

import java.util.List;

public class DonationMapper {
        public static DonationDto mapFrom(Donation source){
            return new DonationDto(source.getId(),
                    source.getUser(),
                    source.getAmount(),
                    source.getAddress(),
                    source.getDate(),
                    source.getFoundation());
        }

        public static Donation mapFrom(DonationDto source){
            return new Donation(source.id(),
                    source.user(),
                    source.amount(),
                    source.address(),
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

