package esprit.tn.testattiaimed.Controller;

import esprit.tn.testattiaimed.Entites.Menu;
import esprit.tn.testattiaimed.Entites.Restaurant;
import esprit.tn.testattiaimed.Repository.MenuRepository;
import esprit.tn.testattiaimed.Service.MenuService;
import esprit.tn.testattiaimed.Service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Menu")
public class MenuController {
    @Autowired
    MenuService menuService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Menu> addMEnu(@RequestBody Menu menu){
        Menu addedMenu = menuService.ajoutComposantsEtMiseAJourPTM(menu.getComposant(), menu.getIdMenu());
        return new ResponseEntity<>(addedMenu, HttpStatus.CREATED);
    }



//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> deleteUniversite(@PathVariable long id){
}
