package com.Project.JIRA_lite.Repository;

import com.Project.JIRA_lite.Entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepo extends JpaRepository<Ticket, Integer> {
}
