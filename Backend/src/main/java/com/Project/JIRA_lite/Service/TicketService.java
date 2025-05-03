package com.Project.JIRA_lite.Service;

import com.Project.JIRA_lite.Entity.Ticket;
import com.Project.JIRA_lite.Repository.TicketRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TicketService {
    TicketRepo ticketRepo;

    TicketService(TicketRepo ticketRepo) {
        this.ticketRepo = ticketRepo;
    }

    public List<Ticket> getTickets() {
        return this.ticketRepo.findAll();
    }

    public List<Ticket> createTicket(Ticket ticket) {
        System.out.println("saved ticket " + this.ticketRepo.save(ticket));
        return this.ticketRepo.findAll();
    }
}
