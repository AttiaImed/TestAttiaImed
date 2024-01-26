package esprit.tn.testattiaimed.Repository;

import esprit.tn.testattiaimed.Entites.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantRepository extends JpaRepository<Restaurant,Long> {
}
