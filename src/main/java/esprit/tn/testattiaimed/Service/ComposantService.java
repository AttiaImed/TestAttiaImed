package esprit.tn.testattiaimed.Service;

import esprit.tn.testattiaimed.Entites.Composant;

import java.util.List;

public interface ComposantService {
    List<Composant> getAllComposant();
    Composant addComposant(Composant e);
    void removeComposant(long id);
    Composant modifyComposant(Composant e, long id);
}
