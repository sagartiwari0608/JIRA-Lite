package com.Project.JIRA_lite.Entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    // One Employee(current class) can have many AssignedTasks.
    // and this relation is owned by Ticket Class and this data will be handled in ticket class by mapping "assignedTo" with this.
    @OneToMany(mappedBy = "assignedTo")
    private List<Ticket> assignedTickets = new ArrayList<>();

    @OneToMany(mappedBy = "creator")       // One Employee can have many createdTickets.
    private List<Ticket> createdTickets = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Ticket> getAssignedTickets() {
        return assignedTickets;
    }

    public void setAssignedTickets(List<Ticket> assignedTickets) {
        this.assignedTickets = assignedTickets;
    }

    public List<Ticket> getCreatedTickets() {
        return createdTickets;
    }

    public void setCreatedTickets(List<Ticket> createdTickets) {
        this.createdTickets = createdTickets;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
