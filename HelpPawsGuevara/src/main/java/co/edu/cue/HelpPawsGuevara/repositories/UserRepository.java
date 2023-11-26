package co.edu.cue.HelpPawsGuevara.repositories;

import co.edu.cue.HelpPawsGuevara.domain.entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User,Integer> {
}
