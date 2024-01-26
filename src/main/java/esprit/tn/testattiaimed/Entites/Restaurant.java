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
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idRestaurant;
    private String nom;
    private long nbPlacesMax;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Menu> menus;
}
