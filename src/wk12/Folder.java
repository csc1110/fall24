package wk12;

import java.util.ArrayList;
import java.util.List;

public class Folder extends DesktopItem implements Group {
    private List<DesktopItem> items;

    public Folder(String name) {
        super(name);
        items = new ArrayList<>();
    }

    @Override
    public void open() {
        for (DesktopItem item : items) {
            System.out.println(item.getName());
            item.open();
        }
    }

    @Override
    public boolean add(DesktopItem item) {
        return items.add(item);
    }

    @Override
    public int size() {
        int size = super.size();
        for (DesktopItem item : items) {
            size += item.size();
        }
        return size;
    }
}
