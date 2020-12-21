package com.david.crudapl.controller;

import com.david.crudapl.model.Region;
import com.david.crudapl.repository.RegionRepository;
import com.david.crudapl.repository.io.JavaIORegionRepositoryImpl;
import com.david.crudapl.view.RegionView;

import java.util.List;

public class RegionController {
    RegionRepository rc = new JavaIORegionRepositoryImpl();

    public List<Region> getAll() {
        return rc.getAll();
    }

    public Region getById(String id) {
        return rc.getById(Long.parseLong(id));
    }

    public Region save(String id, String name) {
        return rc.save(new Region(Long.parseLong(id), name));
    }

    public Region update(String id, String name) {
        return rc.update(new Region(Long.parseLong(id), name));
    }

    public void deleteById(String id){
        rc.deleteById(Long.parseLong(id));
    }
}
