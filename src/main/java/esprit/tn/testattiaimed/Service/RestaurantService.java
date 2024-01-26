package esprit.tn.testattiaimed.Service;

import esprit.tn.testattiaimed.Entites.Restaurant;

import java.util.List;

public interface RestaurantService {
    List<Restaurant> getAllRestaurant();
    Restaurant addRestaurant(Restaurant e);
    void removeRestaurant(long id);
    Restaurant modifyRestaurant(Restaurant e, long id);
    Restaurant ajouterRestaurantEtMenusAssocie(Restaurant restaurant);
}
