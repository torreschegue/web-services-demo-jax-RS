package com.torresdevelop.apiresful.service;

import com.torresdevelop.apiresful.model.Item;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Path("api/v1/")
public class ServiceItem {
    @GET
    @Path("greeting/{name}")
    public String greeting(@PathParam("name") final String name){
        return "Bienvenido: " + name + ", al Web Service";
    }

    @GET
    @Path("add/{n1}/{n2}")
    public String addNumber(@PathParam("n1") int n1,@PathParam("n2") int n2 ){
        int suma = (n1 + n2);
        return "la suma es: " + suma;
    }

    @GET
    @Path("item")
    @Produces(MediaType.APPLICATION_JSON)
    public Item getItem() {
        Item item = new Item("Computadora", 2500, 1);
        return item;
    }

    @GET
    @Path("itemList")
    @Produces(MediaType.APPLICATION_XML)
    public List<Item> getCollItems() {
        List list = new ArrayList();
        Item item1 = new Item("computer",2500, 4);
        Item item2 = new Item("chair",100, 6);
        Item item3 = new Item("table",200, 8);

        list.add(item1);
        list.add(item2);
        list.add(item3);

        return list;
    }

    @GET
    @Path("itemListJson")
    @Produces("application/json")
    public List<Item>  getJSONItems() {
        ArrayList list = new ArrayList();
        Item item1 = new Item("computer",2500, 4);
        Item item2 = new Item("chair",100, 6);
        Item item3 = new Item("table",200, 8);

        list.add(item1);
        list.add(item2);
        list.add(item3);

        return list;
    }

}
