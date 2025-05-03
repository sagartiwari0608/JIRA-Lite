package com.Project.JIRA_lite.Controllers;

import com.Project.JIRA_lite.Entity.Ticket;
import com.Project.JIRA_lite.Service.TicketService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TicketsController {
    private final TicketService ticketService;

    TicketsController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @GetMapping("/tickets")
    public List<Ticket> getTickets() {
        return this.ticketService.getTickets();
    }

    @PostMapping("/ticket")
    public List<Ticket> createTicket(@RequestBody Ticket ticket) {
//        List<Ticket> tickets = this.ticketService.createTicket(ticket);
        return this.ticketService.createTicket(ticket);
    }
}
