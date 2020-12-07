package com.david.crudapl.model;

public class Region {
    Long id;
    String name;

    public Region(Long id, String name){
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return  id +
                ", " + name  + System.lineSeparator();
    }
}
