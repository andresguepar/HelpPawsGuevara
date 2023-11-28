package co.edu.cue.HelpPawsGuevara.repositories;

import co.edu.cue.HelpPawsGuevara.domain.entities.Foundation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoundationRepository extends CrudRepository<Foundation,Integer> {
    public Long countById(Integer id);
}
