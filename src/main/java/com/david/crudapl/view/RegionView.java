package com.david.crudapl.view;

import com.david.crudapl.controller.RegionController;
import com.david.crudapl.model.Region;

import java.util.Scanner;

public class RegionView {


    public Long createForOutupGetById(String idForGet){
        return Long.parseLong(idForGet);
    }

    public Long createForDelete(String idForDelete){
        return Long.parseLong(idForDelete);
    }

    public Region createForSaved(String idForSave, String nameForSave) {
        return new Region(Long.parseLong(idForSave), nameForSave);
    }

    public Region createForUpdate(String idForUpdate, String nameForUpdate) {
        return new Region(Long.parseLong(idForUpdate), nameForUpdate);
    }

    public static void main(String[] args) {
        RegionController regionController = new RegionController();
        Scanner sc = new Scanner(System.in);
        System.out.println("Какую команду исполнить ?");
        String task = sc.next();

        String getAllTask = "Вывести всё";

        String getByIdTask = "Вывести по id ";

        String saveIdTask = "Сохранить";

        String deleteByIdTask = "Удалить";

        String updateTask = "Редактировать запись";

        if(task.equals(getByIdTask)) {
            System.out.println("Введите id, который хотите вывести");
            String idForGet = sc.next();
            regionController.getById(idForGet);
        } else if(task.equals(saveIdTask)) {
            System.out.println("Введите id и name для сохранения");
            String idForSave = sc.next();
            String nameForSave = sc.next();
            regionController.save(idForSave, nameForSave);
        } else if(task.equals(deleteByIdTask)) {
            System.out.println("Введите id, который хотите удалить");
            String idForDelete = sc.next();
            regionController.deleteById(idForDelete);
        } else if(task.equals(updateTask)){
            System.out.println("Введите id и name для редактирования");
            String idForUpdate = sc.next();
            String nameForUpdate = sc.next();
            regionController.update(idForUpdate, nameForUpdate);
        } else if(task.equals(getAllTask)) {
            regionController.getAll();
        }

    }

}
