package com.david.crudapl.view;

import Console.ConsoleInput;
import com.david.crudapl.controller.RegionController;
import com.david.crudapl.model.Region;

import java.util.List;
import java.util.Scanner;

public class RegionView {
    public RegionController rc = new RegionController();

    public void getAll(){
        List<Region> regions = rc.getAll();
        regions.forEach(r -> {
            System.out.println(r);
        });
    }

    public void getById(){
        Region region = rc.getById(ConsoleInput.id);
        System.out.println(region);
    }

    public void save(){
        rc.save(ConsoleInput.savingId, ConsoleInput.savingReg);
        getAll();
    }

    public void update(){
        rc.update(ConsoleInput.updateId, ConsoleInput.updateReg);
        getAll();

    }

    public void deleteById(){
        rc.deleteById(ConsoleInput.deleteId);
        getAll();

    }
}
