package com.Project.JIRA_lite.Entity;

import jakarta.persistence.*;

@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    int ParentTaskId;
    @OneToOne
    Employee Commenter;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getParentTaskId() {
        return ParentTaskId;
    }

    public void setParentTaskId(int parentTaskId) {
        ParentTaskId = parentTaskId;
    }

    public Employee getCommenter() {
        return Commenter;
    }

    public void setCommenter(Employee commenter) {
        Commenter = commenter;
    }


}
