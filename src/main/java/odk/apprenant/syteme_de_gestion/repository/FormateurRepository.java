package odk.apprenant.syteme_de_gestion.repository;

import odk.apprenant.syteme_de_gestion.modele.Formateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface FormateurRepository extends JpaRepository<Formateur, Long> {
}
