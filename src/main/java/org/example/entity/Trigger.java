package org.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "triggers")
public class Trigger {
    @Id
    @Column(name = "triggerid")
    Integer id;

    @Column(name = "expression")
    String expression;

    @Column(name = "description")
    String description;

    @Column(name = "status")
    int status;

    public Trigger() {
    }

    public Trigger(Integer id, String expression, String description) {
        this.id = id;
        this.expression = expression;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
