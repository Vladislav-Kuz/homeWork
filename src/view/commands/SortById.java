package view.commands;

import view.View;

public class SortById extends Command{
    public SortById(View view) {
        super(view, "Сортировка по ID");
    }

    @Override
    public void execute() {
        getView().sortById();
    }
}
