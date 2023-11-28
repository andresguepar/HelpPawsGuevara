package co.edu.cue.HelpPawsGuevara.mapping.mappers;

import co.edu.cue.HelpPawsGuevara.domain.entities.Foundation;
import co.edu.cue.HelpPawsGuevara.mapping.dtos.FoundationDto;

import java.util.List;

public class FoundationMapper {
    public static FoundationDto mapFrom(Foundation source){
        return new FoundationDto(source.getId(),
                source.getName(),
                source.getAddress(),
                source.getPhone());
    }

    public static Foundation mapFrom(FoundationDto source){
        return new Foundation(source.id(),
                source.name(),
                source.address(),
                source.phone());
    }

    public static List<Foundation> mapFrom(List<FoundationDto> source){
        return source.parallelStream()
                .map(FoundationMapper::mapFrom)
                .toList();

    }
    public static List<FoundationDto> mapFromDto(List<Foundation> source){
        return source.parallelStream()
                .map(FoundationMapper::mapFrom)
                .toList();

    }
}