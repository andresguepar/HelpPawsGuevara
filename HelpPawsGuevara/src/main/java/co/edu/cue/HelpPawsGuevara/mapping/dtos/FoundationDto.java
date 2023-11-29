package co.edu.cue.HelpPawsGuevara.mapping.dtos;

import lombok.Builder;

@Builder
public record FoundationDto ( int id,
         String name,
         String address,
         String phone) {
}
