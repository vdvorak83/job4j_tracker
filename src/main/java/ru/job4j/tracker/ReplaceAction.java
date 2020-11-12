package ru.job4j.tracker;

public class ReplaceAction implements UserAction {
    @Override
    public String name() {
        return "=== Edit item ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = Integer.parseInt(input.askStr("Enter id: "));
        String name = input.askStr("Enter new name: ");
        Item item = new Item(name);
        boolean rls = tracker.replace(id, item);
        if (rls) {
            System.out.println("Заявка с id " + id + " изменена");
        } else {
            System.out.println("Заявка с таким id не найдена");
        }
        return true;
    }
}
