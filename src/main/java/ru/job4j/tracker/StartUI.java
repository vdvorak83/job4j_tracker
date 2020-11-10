package ru.job4j.tracker;

public class StartUI {
    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = Integer.parseInt(input.askStr("Select: "));
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                String name = input.askStr("Enter name: ");
                Item item = new Item(name);
                tracker.add(item);
            } else if (select == 1) {
                System.out.println("=== Show all items ====");
                Item[] items = tracker.findAll();
                for (Item item : items) {
                    System.out.println(item);
                }
            } else if (select == 2) {
                System.out.println("=== Edit item ====");
                int id = Integer.parseInt(input.askStr("Enter id: "));
                String name = input.askStr("Enter new name: ");
                Item item = new Item(name);
                boolean rls = tracker.replace(id, item);
                if (rls) {
                    System.out.println("Заявка с id " + id + " изменена");
                } else {
                    System.out.println("Заявка с таким id не найдена");
                }
            } else if (select == 3) {
                System.out.println("=== Delete item ====");
                int id = Integer.parseInt(input.askStr("Enter id: "));
                System.out.println(id);
                boolean rls = tracker.delete(id);
                if (rls) {
                    System.out.println("Заявка с id " + id + " удалена");
                } else {
                    System.out.println("Заявка с таким id не найдена");
                }
            } else if (select == 4) {
                System.out.println("=== Find item by Id ====");
                int id = Integer.parseInt(input.askStr("Enter id: "));
                System.out.println(id);
                Item rls = tracker.findById(id);
                if (rls != null) {
                 System.out.println("Name " + rls.getName() + "id" + rls.getId());
                } else {
                    System.out.println("Заявка с таким id не найдена");
                }
            } else if (select == 5) {
                System.out.println("===  Find items by name ====");
                String name = input.askStr("Enter name: ");
                Item[] item = tracker.findByName(name);
                if (item.length > 0) {
                    for (Item value : item) {
                        System.out.println(value);
                    }
                    } else {
                        System.out.println("Заявка с таким id не найдена");
                    }
            } else if (select == 6) {
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");

    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}