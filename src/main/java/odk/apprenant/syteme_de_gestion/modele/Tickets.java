package odk.apprenant.syteme_de_gestion.modele;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table
@Data
public class Tickets {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Apprenant apprenant;

    @ManyToOne
    private Categorie categorie;

    @ManyToOne
    private Formateur formateur;

    private String description;
    private String status;
    private String priorite;

    @Temporal(TemporalType.TIMESTAMP)
    private Date date;
}
