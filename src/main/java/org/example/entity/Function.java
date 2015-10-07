package org.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "functions")
public class Function {
    @Id
    @Column(name = "functionid")
    Integer id;

    @Column(name = "function")
    String function;

    @ManyToOne
    @JoinColumn(name = "triggerid", referencedColumnName = "triggerid")
    Trigger trigger;

    public Function() {
    }

    public Function(Integer id, String function, Trigger trigger) {
        this.id = id;
        this.function = function;
        this.trigger = trigger;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Trigger getTrigger() {
        return trigger;
    }

    public void setTrigger(Trigger trigger) {
        this.trigger = trigger;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }
}
