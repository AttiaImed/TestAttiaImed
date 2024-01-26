package esprit.tn.testattiaimed.Service;

import esprit.tn.testattiaimed.Entites.Client;

import java.util.List;

public interface ClientService {
    List<Client> getAllClient();
    Client addClient(Client e);
    void removeClient(long id);
    Client modifyClient(Client e, long id);
    void affecterClientMenu(String idClient,String LibelleMenu);

}
