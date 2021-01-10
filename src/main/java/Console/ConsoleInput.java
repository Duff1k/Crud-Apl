package Console;

import com.david.crudapl.view.RegionView;

import java.util.Scanner;

public class ConsoleInput {

    public static String id;

    public static String savingId;
    public static  String savingReg;

    public static String updateId;
    public static  String updateReg;

    public static String deleteId;

    public static void main(String[] args) {
        System.out.println("Что для вас сделать ? Введите Region, если хотите работать с файлом regions.txt");
        Scanner scanner = new Scanner(System.in);
        String task = scanner.next();
        if(task.equals("Region")) {
            RegionView regionView = new RegionView();
            System.out.println("Какую задачу выполнить ? (Вывести, ВывестиId, Сохранить, Изменить, Удалить");
            String subproblem = scanner.next();
            if(subproblem.equals("Вывести")) {
                regionView.getAll();
            } else if(subproblem.equals("ВывестиId")) {
                ConsoleInput.id = scanner.next();
                regionView.getById();
            } else if(subproblem.equals("Сохранить")) {
                ConsoleInput.savingId = scanner.next();
                ConsoleInput.savingReg = scanner.next();
                regionView.save();
            } else if(subproblem.equals("Удалить")) {
                ConsoleInput.deleteId = scanner.next();
                regionView.deleteById();
            } else if(subproblem.equals("Изменить")) {
                ConsoleInput.updateId = scanner.next();
                ConsoleInput.updateReg = scanner.next();
                regionView.update();
            }
        }
    }

}
