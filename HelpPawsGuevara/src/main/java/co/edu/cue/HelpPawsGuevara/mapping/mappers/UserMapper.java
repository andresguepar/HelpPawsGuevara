package co.edu.cue.HelpPawsGuevara.mapping.mappers;

import co.edu.cue.HelpPawsGuevara.domain.entities.User;
import co.edu.cue.HelpPawsGuevara.mapping.dtos.UserDto;

import java.util.List;

public class UserMapper {
        public static UserDto mapFrom(User source){
            return new UserDto(source.getId(),
                    source.getName(),
                    source.getEmail(),
                    source.getPassword());
        }

        public static User mapFrom(UserDto source){
            return new User(source.id(),
                    source.name(),
                    source.email(),
                    source.password());
        }

        public static List<User> mapFrom(List<UserDto> source){
            return source.parallelStream()
                    .map(UserMapper::mapFrom)
                    .toList();

        }
        public static List<UserDto> mapFromDto(List<User> source){
            return source.parallelStream()
                    .map(UserMapper::mapFrom)
                    .toList();

        }
}

