package esprit.tn.testattiaimed.Repository;

import esprit.tn.testattiaimed.Entites.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,Long> {
    Client findByIdentifiant(String identifiant);
}
