package esprit.tn.testattiaimed.Service;

import esprit.tn.testattiaimed.Entites.Composant;
import esprit.tn.testattiaimed.Entites.Menu;

import java.util.List;
import java.util.Set;

public interface MenuService {
    List<Menu> getAllMenu();
    Menu addMenu(Menu e);
    void removeMenu(long id);
    Menu modifyMenu(Menu e, long id);

    Menu ajoutComposantsEtMiseAJourPTM(List<Composant> composants,Long idMenu);

}
