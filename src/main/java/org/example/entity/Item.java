package org.example.entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "items")
public class Item {
    @Id
    @Column(name = "itemid")
    Integer id;

    @Column(name = "name")
    String name;

    @Column(name = "key_")
    String key;

    @OneToMany
    @JoinColumn(name = "itemid", referencedColumnName = "itemid")
    public List<Function> functions = new ArrayList<>();

    public Item() {
    }

    public Item(Integer id, String name, String key, Function... functions) {
        this.id = id;
        this.name = name;
        this.key = key;
        this.functions = Arrays.asList(functions);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
