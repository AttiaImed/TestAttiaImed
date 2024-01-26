package esprit.tn.testattiaimed.Service.ServiceImpl;

import esprit.tn.testattiaimed.Entites.Menu;
import esprit.tn.testattiaimed.Entites.Restaurant;
import esprit.tn.testattiaimed.Repository.MenuRepository;
import esprit.tn.testattiaimed.Repository.RestaurantRepository;
import esprit.tn.testattiaimed.Service.RestaurantService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Primary
@Service("RestaurantServiceImpl")
@AllArgsConstructor
public class RestaurantServiceImpl implements RestaurantService {
    RestaurantRepository restaurantRepository;
    MenuRepository menuRepository;
    @Override
    public List<Restaurant> getAllRestaurant() {
        return null;
    }

    @Override
    public Restaurant addRestaurant(Restaurant restaurant) {
        List<Menu> menus = restaurant.getMenus();
        Restaurant r = restaurantRepository.save(restaurant);
        for (Menu menu : menus) {
            menu.setPrixTotal(0);
            menuRepository.save(menu);
        }
        return r;
    }

    @Override
    public void removeRestaurant(long id) {

    }

    @Override
    public Restaurant modifyRestaurant(Restaurant e, long id) {
        return null;
    }

    @Override
    public Restaurant ajouterRestaurantEtMenusAssocie(Restaurant restaurant) {
        List<Menu> menus = restaurant.getMenus();
        Restaurant r = restaurantRepository.save(restaurant);
        for (Menu menu : menus) {
            menuRepository.save(menu);
        }
        return r;
    }
}
