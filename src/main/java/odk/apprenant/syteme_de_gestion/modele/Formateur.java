package odk.apprenant.syteme_de_gestion.modele;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "formateur")
@Data
public class Formateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 50)
    private String nom;
    private String prenom;
    private String email;
}
