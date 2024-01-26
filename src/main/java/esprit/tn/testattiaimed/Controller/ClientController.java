package esprit.tn.testattiaimed.Controller;

import esprit.tn.testattiaimed.Entites.Client;
import esprit.tn.testattiaimed.Entites.Menu;
import esprit.tn.testattiaimed.Service.ClientService;
import esprit.tn.testattiaimed.Service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Client")
public class ClientController {
    @Autowired
    ClientService clientService;
    MenuService menuService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Client> addFoyer(@RequestBody Client client){
        Client addedClient = clientService.addClient(client);
        return new ResponseEntity<>(addedClient, HttpStatus.CREATED);
    }

    @PostMapping(path = "/{id}",consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Menu> affcterClientAMenu(@PathVariable String id, @RequestBody String libelle){
        clientService.affecterClientMenu(id, libelle);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

}
