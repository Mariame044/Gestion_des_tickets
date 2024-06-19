package odk.apprenant.syteme_de_gestion.modele;

import jakarta.persistence.*;
import lombok.Data;

import java.security.Timestamp;

@Entity
@Table(name = "connaissance")
@Data
public class connaissance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titre;
    private String description;
    private Timestamp date_debut;

}
