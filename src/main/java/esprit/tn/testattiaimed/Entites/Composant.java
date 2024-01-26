package esprit.tn.testattiaimed.Entites;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Composant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idComposant;
    private String nomComposant;
    private float prix;
    @ManyToOne
    Menu menu;
}
