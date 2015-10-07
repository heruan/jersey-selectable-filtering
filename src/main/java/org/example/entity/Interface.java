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
@Table(name = "interface")
public class Interface {
    @Id
    @Column(name = "interfaceid")
    Integer id;

    @Column(name = "main")
    boolean main;

    @Column(name = "type")
    int type;

    @Column(name = "ip")
    String ip;

    @Column(name = "dns")
    String dns;

    @OneToMany
    @JoinColumn(name = "interfaceid", referencedColumnName = "interfaceid")
    List<Item> items = new ArrayList<>();

    public Interface() {
    }

    public Interface(Integer id, String ip, boolean main, Item... items) {
        this.id = id;
        this.ip = ip;
        this.main = main;
        this.type = 0;
        this.items = Arrays.asList(items);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public boolean isMain() {
        return main;
    }

    public void setMain(boolean main) {
        this.main = main;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getDns() {
        return dns;
    }

    public void setDns(String dns) {
        this.dns = dns;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
