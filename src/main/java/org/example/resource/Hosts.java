package org.example.resource;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.example.entity.Function;
import org.example.entity.Host;
import org.example.entity.Interface;
import org.example.entity.Item;
import org.example.entity.Trigger;

@Path("/hosts")
public class Hosts {
    @PersistenceContext(unitName = "default")
    EntityManager em;
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Host> getHosts() {
        List<Host> list = new ArrayList<>();
        list.add(new Host(1, "h1", new Interface(1, "192.168.1.1", true,
                new Item(1, "foo", "bar", new Function(1, "last", new Trigger(1, "foo = bar", "foobar"))))));
        list.add(new Host(1, "h1", new Interface(1, "192.168.1.1", true,
                new Item(1, "foo", "bar", new Function(1, "last", new Trigger(1, "foo = bar", "foobar"))))));
        list.add(new Host(1, "h1", new Interface(1, "192.168.1.1", true,
                new Item(1, "foo", "bar", new Function(1, "last", new Trigger(1, "foo = bar", "foobar"))))));
        return list;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Host getHost(@PathParam("id") Integer id) {
        return new Host(id, "h1", new Interface(1, "192.168.1.1", true,
                new Item(1, "foo", "bar", new Function(1, "last", new Trigger(1, "foo = bar", "foobar")))));
    }
}
