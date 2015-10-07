package org.example.entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "hosts")
public class Host {
    public static enum Status {
        MONITORED, NOT_MONITORED, EMPTY1, TEMPLATE, EMPTY2, PROXY_ACTIVE, PROXY_PASSIVE
    }

    @Id
    @Column(name = "hostid")
    Integer id;

    @Column(name = "host")
    String host;

    @Column(name = "status")
    @Enumerated
    Status status;

    @OneToMany
    @JoinColumn(name = "hostid", referencedColumnName = "hostid")
    List<Interface> interfaces = new ArrayList<>();

    @Transient
    String serialNumber;

    @Transient
    String location;

    @Transient
    Double latitude;

    @Transient
    Double longitude;

    public Host() {
    }

    public Host(Integer id, String host, Interface... interfaces) {
        this.id = id;
        this.host = host;
        this.interfaces = Arrays.asList(interfaces);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public List<Interface> getInterfaces() {
        return interfaces;
    }

    public void setInterfaces(List<Interface> interfaces) {
        this.interfaces = interfaces;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }
}
