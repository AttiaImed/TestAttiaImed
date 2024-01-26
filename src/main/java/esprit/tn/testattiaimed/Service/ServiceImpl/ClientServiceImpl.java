package esprit.tn.testattiaimed.Service.ServiceImpl;

import esprit.tn.testattiaimed.Entites.Client;
import esprit.tn.testattiaimed.Entites.Menu;
import esprit.tn.testattiaimed.Repository.ClientRepository;
import esprit.tn.testattiaimed.Repository.MenuRepository;
import esprit.tn.testattiaimed.Service.ClientService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
@Primary
@Service("ClientServiceImpl")
@AllArgsConstructor
public class ClientServiceImpl implements ClientService {
    ClientRepository clientRepository;
    MenuRepository menuRepository;
    @Override
    public List<Client> getAllClient() {
        return null;
    }

    @Override
    public Client addClient(Client e) {

        e.setDatePermiereViste(LocalDate.now());
        return clientRepository.save(e);
    }

    @Override
    public void removeClient(long id) {

    }

    @Override
    public Client modifyClient(Client e, long id) {
        return null;
    }

    @Override
    public void affecterClientMenu(String idClient, String LibelleMenu) {
        Client client = clientRepository.findByIdentifiant(idClient);
        Menu menu = menuRepository.findByLibelleMenu(LibelleMenu);
        if (client != null && menu != null){
            menu.getClients().add(client);
            menuRepository.save(menu);
        }
    }
}
