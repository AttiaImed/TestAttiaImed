package esprit.tn.testattiaimed.Service.ServiceImpl;

import esprit.tn.testattiaimed.Entites.Composant;
import esprit.tn.testattiaimed.Entites.Menu;
import esprit.tn.testattiaimed.Repository.ComposantRepository;
import esprit.tn.testattiaimed.Repository.MenuRepository;
import esprit.tn.testattiaimed.Service.MenuService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Primary
@Service("MenuServiceImpl")
@AllArgsConstructor
public class MenuServiceImpl implements MenuService {
    MenuRepository menuRepository;
    ComposantRepository  compositeRepository;
    @Override
    public List<Menu> getAllMenu() {
        return null;
    }

    @Override
    public Menu addMenu(Menu e) {
        return menuRepository.save(e);
    }

    @Override
    public void removeMenu(long id) {

    }

    @Override
    public Menu modifyMenu(Menu e, long id) {
        return null;
    }

    @Override
    public Menu ajoutComposantsEtMiseAJourPTM(List<Composant> composants, Long idMenu) {
        Menu menu = menuRepository.findById(idMenu).orElse(null);
        if (menu != null) {
            menu.setComposant(composants);
            menu.setPrixTotal(0);
            for (Composant composant : composants) {
                if(menu.getPrixTotal()<20){
                    menu.setPrixTotal(menu.getPrixTotal() + composant.getPrix());
                    compositeRepository.save(composant);
                }
            }
            return menuRepository.save(menu);
        }
        return menu;
    }
}
