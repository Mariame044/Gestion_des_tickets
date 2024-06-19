package odk.apprenant.syteme_de_gestion.service;

import odk.apprenant.syteme_de_gestion.modele.Tickets;
import odk.apprenant.syteme_de_gestion.repository.TicketsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketsService {
    private final TicketsRepository ticketsRepository;
    @Autowired
    public TicketsService(TicketsRepository ticketsRepository) {
        this.ticketsRepository = ticketsRepository;
    }
    public List<Tickets> getAllTickets() {
        return ticketsRepository.findAll();
    }

    public Tickets getTicketById(Long id) {
        return ticketsRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Ticket non trouvé avec l'ID : " + id));
    }

    public Tickets createTicket(Tickets ticket) {
        return ticketsRepository.save(ticket);
    }

    public Tickets updateTicket(Long id, Tickets ticket) {
        ticket.setId(id); // Assurez-vous que l'ID du ticket à mettre à jour est défini
        return ticketsRepository.save(ticket);
    }

    public void deleteTicket(Long id) {
        ticketsRepository.deleteById(id);
    }
}
