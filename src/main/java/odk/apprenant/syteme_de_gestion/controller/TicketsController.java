package odk.apprenant.syteme_de_gestion.controller;

import odk.apprenant.syteme_de_gestion.modele.Tickets;
import odk.apprenant.syteme_de_gestion.service.TicketsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tickets")
public class TicketsController {

    @Autowired
    private final TicketsService ticketsService;
    public TicketsController(TicketsService ticketsService) {
        this.ticketsService = ticketsService;
    }
    @GetMapping("/")
    public List<Tickets> getAllTickets() {
        return ticketsService.getAllTickets();
    }

    @GetMapping("/{id}")
    public Tickets getTicketById(@PathVariable Long id) {
        return ticketsService.getTicketById(id);
    }

    @PostMapping("/")
    public Tickets createTicket(@RequestBody Tickets ticket) {
        return ticketsService.createTicket(ticket);
    }

    @PutMapping("/{id}")
    public Tickets updateTicket(@PathVariable Long id, @RequestBody Tickets ticket) {
        return ticketsService.updateTicket(id, ticket);
    }

    @DeleteMapping("/{id}")
    public void deleteTicket(@PathVariable Long id) {
        ticketsService.deleteTicket(id);
    }
}
