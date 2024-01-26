package esprit.tn.testattiaimed.Entites;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idMenu;
    private String libelleMenu;
    @Enumerated(EnumType.STRING)
    private TypeMenu typeMenu;
    private float prixTotal;
    @OneToMany(cascade = CascadeType.ALL , mappedBy = "menu")
    private List<Composant> composant;

    @ManyToMany(mappedBy = "menus",cascade = CascadeType.ALL)
    private List<Client> clients;
}
