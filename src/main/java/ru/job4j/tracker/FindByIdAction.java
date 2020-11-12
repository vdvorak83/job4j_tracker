package ru.job4j.tracker;

public class FindByIdAction implements UserAction {
    private final Output out;

    public FindByIdAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Find item by Id";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Find item by Id ====");
        int id = Integer.parseInt(input.askStr("Enter id: "));
        System.out.println(id);
        Item rls = tracker.findById(id);
        if (rls != null) {
            System.out.println("Name " + rls.getName() + "id" + rls.getId());
        } else {
            System.out.println("Заявка с таким id не найдена");
        }
        return true;
    }
}
