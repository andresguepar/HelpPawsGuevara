package co.edu.cue.HelpPawsGuevara.repositories;

import co.edu.cue.HelpPawsGuevara.domain.entities.Donation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DonationRepository extends CrudRepository<Donation,Integer> {

}
