package esprit.tn.testattiaimed.Controller;

import esprit.tn.testattiaimed.Entites.Client;
import esprit.tn.testattiaimed.Entites.Restaurant;
import esprit.tn.testattiaimed.Service.ClientService;
import esprit.tn.testattiaimed.Service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Restaurant")
public class RetaurantService {
    @Autowired
    RestaurantService restaurantService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Restaurant> addFoyer(@RequestBody Restaurant restaurant){
        Restaurant addedRestaurant = restaurantService.addRestaurant(restaurant);
        return new ResponseEntity<>(addedRestaurant, HttpStatus.CREATED);
    }

    @PostMapping( path="/addResMenu",consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Restaurant> addResMEnu(@RequestBody Restaurant restaurant){
        Restaurant addedRestaurant = restaurantService.ajouterRestaurantEtMenusAssocie(restaurant);
        return new ResponseEntity<>(addedRestaurant, HttpStatus.CREATED);
    }

}
