package odk.apprenant.syteme_de_gestion.repository;

import odk.apprenant.syteme_de_gestion.modele.Tickets;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface TicketsRepository extends JpaRepository<Tickets, Long> {
}
