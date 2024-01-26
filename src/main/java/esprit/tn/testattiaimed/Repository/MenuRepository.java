package esprit.tn.testattiaimed.Repository;

import esprit.tn.testattiaimed.Entites.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepository extends JpaRepository<Menu,Long> {
    Menu findByTypeMenu(String typeMenu);
    Menu findByLibelleMenu(String libelleMenu);
}
