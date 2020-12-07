package com.david.crudapl.controller;

import com.david.crudapl.model.Region;
import com.david.crudapl.repository.RegionRepository;
import com.david.crudapl.repository.io.JavaIORegionRepositoryImpl;
import com.david.crudapl.view.RegionView;

import java.util.List;

public class RegionController {
    RegionRepository rc = new JavaIORegionRepositoryImpl();
    RegionView rw = new RegionView();


    public List<Region> getAll() {
        return rc.getAll();
    }

    public Region getById(String id) {
        return rc.getById(rw.createForOutupGetById(id));
    }

    public Region save(String id, String name) {
        return rc.save(rw.createForSaved(id, name));
    }

    public Region update(String id, String name) {
        return rc.save(rw.createForUpdate(id, name));
    }

    public void deleteById(String id){
        rc.deleteById(rw.createForDelete(id));
    }
}
